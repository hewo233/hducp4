import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 检查是否提供了输入文件
        if (args.length < 1) {
            System.err.println("Please provide an input file.");
            System.exit(1);
        }

        System.out.println("lab4.3 :");

        // 创建一个输入流
        CharStream input = CharStreams.fromFileName(args[0]);

        // 使用SysYLexer对输入进行词法分析
        SysYLexer lexer = new SysYLexer(input);

        // 自定义 Lexer 错误监听器
        lexer.removeErrorListeners();

        LexerErrorListener myLexerErrorListener = new LexerErrorListener();
        lexer.addErrorListener(myLexerErrorListener);

        // 检查是否有解析错误
        if (myLexerErrorListener.hasErr()) {
            System.out.println("Parsing encountered errors. Exiting.");
            System.exit(0);
        }

        // 创建一个用于保存词法分析器生成的tokens的缓冲区
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 创建一个解析器，用于分析token流
        SysYParser parser = new SysYParser(tokens);

        // 自定义 Parser 错误监听器
        parser.removeErrorListeners();

        ParserErrorListener myParserErrorListener = new ParserErrorListener();
        parser.addErrorListener(myParserErrorListener);

        // 指定开始规则，这里假设是'program'
        ParseTree tree = parser.program();

        // 检查是否有解析错误
        if (myParserErrorListener.hasErr()) {
            System.out.println("Parsing encountered errors. Exiting.");
            System.exit(0);
        }

        // 创建一个通用的解析树遍历器
        ParseTreeWalker walker = new ParseTreeWalker();

        // 创建自定义的监听器或访问者
        SysYParserBaseListener listener = new SysYParserBaseListener();
        walker.walk(listener, tree);

        // 或者使用访问者模式
        SysYParserBaseVisitor<?> visitor = new SysYParserBaseVisitor<>();
        visitor.visit(tree);

        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";
        System.out.println(ANSI_GREEN + "PASS" + ANSI_RESET);

        // 如果需要打印树
        System.out.println(tree.toStringTree(parser));
    }
}
