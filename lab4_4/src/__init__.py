import sys
from antlr4 import FileStream, CommonTokenStream, ParseTreeWalker
from generated.SysYLexer import SysYLexer
from generated.SysYParser import SysYParser
from generated.SysYParserListener import SysYParserListener
from generated.SysYParserVisitor import SysYParserVisitor

from antlr4 import ParseTreeListener, TerminalNode

class SemanticAnalyzer(SysYParserVisitor):
    def __init__(self):
        self.symbol_table_stack = [{}]  # 使用栈维护作用域，栈顶为当前作用域
        self.errors = []               # 收集语义错误

    def add_error(self, error_type, ctx, message):
        """添加格式化的错误信息"""
        line = ctx.start.line
        column = ctx.start.column
        self.errors.append(f"{error_type}: [Line: {line}, Column: {column}] {message}")

    def enter_scope(self):
        """进入新作用域"""
        self.symbol_table_stack.append({})

    def exit_scope(self):
        """退出当前作用域"""
        self.symbol_table_stack.pop()

    def declare_symbol(self, name, kind, ctx):
        """声明符号，如果在当前作用域内已存在则报错"""
        current_scope = self.symbol_table_stack[-1]
        if name in current_scope:
            self.add_error("ErrorType 2", ctx, f"{kind.capitalize()} '{name}' is already declared.")
        else:
            current_scope[name] = kind
            print(f"Declared {kind}: {name}")

    def is_declared(self, name):
        """检查符号是否在当前或任何外部作用域中声明"""
        for scope in reversed(self.symbol_table_stack):
            if name in scope:
                return True
        return False

    def visitFuncDef(self, ctx):
        func_name = ctx.IDENT().getText()
        if self.is_declared(func_name):
            self.add_error("ErrorType 4", ctx, f"Function '{func_name}' is already defined.")
        else:
            self.symbol_table_stack[0][func_name] = "function"
            print(f"Defined function: {func_name}")

        # 进入函数作用域
        self.enter_scope()

        # 声明参数
        if ctx.funcFParams():
            for param in ctx.funcFParams().funcFParam():
                param_name = param.IDENT().getText()
                self.declare_symbol(param_name, "parameter", ctx)

        self.visitChildren(ctx)

        # 退出函数作用域
        self.exit_scope()

    def visitBlock(self, ctx):
        self.enter_scope()
        self.visitChildren(ctx)
        self.exit_scope()

    def visitVarDef(self, ctx):
        var_name = ctx.IDENT().getText()
        self.declare_symbol(var_name, "variable", ctx)
        return self.visitChildren(ctx)

    def visitLVal(self, ctx):
        var_name = ctx.IDENT().getText()
        if not self.is_declared(var_name):
            self.add_error("ErrorType 1", ctx, f"Variable '{var_name}' is not declared.")
        return self.visitChildren(ctx)

    def visitExp(self, ctx):
        # 如果遇到函数调用，检查是否定义
        if ctx.IDENT() and ctx.L_PAREN():
            func_name = ctx.IDENT().getText()
            if not self.is_declared(func_name):
                self.add_error("ErrorType 3", ctx, f"Function '{func_name}' is not defined.")
        return self.visitChildren(ctx)
    
    def visitReturnStmt(self, ctx):
        return_expr_type = self.visit(ctx.exp()) if ctx.exp() else None
        func_name = self.current_function
        func_def = self.symbol_table_stack[-1].get(func_name)
        
        if func_def:
            expected_type = func_def["return_type"]
            if return_expr_type != expected_type:
                self.add_error("ErrorType 10", ctx, f"Return type mismatch: expected '{expected_type}', got '{return_expr_type}'.")
        return self.visitChildren(ctx)

    def report_errors(self):
        for error in self.errors:
            print(error)
    

class LexerErrorListener:
    def __init__(self):
        self.has_error = False
    
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        print(f"Lexer error at line {line}:{column} - {msg}")
        self.has_error = True
    
    def hasErr(self):
        return self.has_error

class ParserErrorListener:
    def __init__(self):
        self.has_error = False
    
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        print(f"Parser error at line {line}:{column} - {msg}")
        self.has_error = True
    
    def hasErr(self):
        return self.has_error
    
    def reportAttemptingFullContext(self, recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs):
        print(f"Attempting full context at index {startIndex} to {stopIndex} with conflicting alts {conflictingAlts}")
        self.has_error = True
    
    def reportContextSensitivity(self, recognizer, dfa, startIndex, stopIndex, prediction, configs):
        print(f"Context sensitivity at index {startIndex} to {stopIndex} with prediction {prediction}")
        self.has_error = True


def main():
    # 检查是否提供了输入文件
    if len(sys.argv) < 2:
        print("Please provide an input file.")
        sys.exit(1)

    print("lab4.4 :")

    # 创建一个输入流
    input_stream = FileStream(sys.argv[1])

    # 使用SysYLexer对输入进行词法分析
    lexer = SysYLexer(input_stream)
    
    # 自定义 Lexer 错误监听器
    lexer.removeErrorListeners()
    my_lexer_error_listener = LexerErrorListener()
    lexer.addErrorListener(my_lexer_error_listener)
    
    # 检查是否有解析错误
    if my_lexer_error_listener.hasErr():
        print("Parsing encountered errors. Exiting.")
        sys.exit(0)
    
    # 创建一个用于保存词法分析器生成的tokens的缓冲区
    token_stream = CommonTokenStream(lexer)

    # 创建一个解析器，用于分析token流
    parser = SysYParser(token_stream)

    # 自定义 Parser 错误监听器
    parser.removeErrorListeners()
    my_parser_error_listener = ParserErrorListener()
    parser.addErrorListener(my_parser_error_listener)
    
    # 指定开始规则，这里假设是'program'
    tree = parser.program()


    analyzer = SemanticAnalyzer()
    analyzer.visit(tree)
    analyzer.report_errors()

    # 如果需要打印树
    # print(tree.toStringTree(parser.ruleNames))

if __name__ == "__main__":
    main()


