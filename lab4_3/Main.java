import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Please provide an input file.");
            System.exit(1);
        }

        System.out.println("lab4.3 :");

        CharStream input = CharStreams.fromFileName(args[0]);

        // 使用SysYLexer对输入进行词法分析
        SysYLexer lexer = new SysYLexer(input);

        lexer.removeErrorListeners();

        LexerErrorListener myLexerErrorListener = new LexerErrorListener();
        lexer.addErrorListener(myLexerErrorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 使用SysYParser对词法分析结果进行语法分析
        SysYParser parser = new SysYParser(tokens);

        parser.removeErrorListeners();

        ParserErrorListener myParserErrorListener = new ParserErrorListener();
        parser.addErrorListener(myParserErrorListener);

        ParseTree tree = parser.program();

        // 检查是否有解析错误
        if (myLexerErrorListener.hasErr() || myParserErrorListener.hasErr()) {
            System.out.println("Parsing encountered errors. Exiting.");
            System.exit(0);
        }

        ParseTreeWalker walker = new ParseTreeWalker();

        SysYParserBaseVisitor<?> visitor = new SysYParserBaseVisitor<>();
        visitor.visit(tree);

        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";
        System.out.println(ANSI_GREEN + "PASS" + ANSI_RESET);

        System.out.println(tree.toStringTree(parser));
    }
}
