import org.antlr.v4.runtime.*;
import java.io.*;
import java.util.*;

public class Main {
    private static class Error {
        int line;
        String message;
        
        Error(int line, String message) {
            this.line = line;
            this.message = message;
        }
    }

    private static List<Error> errors = new ArrayList<>();
    private static List<String> tokenList = new ArrayList<>();
    private static boolean hasErrors = false;

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("需要指定输入文件!");
            return;
        }

        // 初始化词法分析器
        CharStream input = CharStreams.fromFileName(args[0]);
        SysYLexer lexer = new SysYLexer(input);
        lexer.removeErrorListeners();
        
        // 错误监听器
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, 
                int line, int charPositionInLine, String msg, RecognitionException e) {
                hasErrors = true;
                Token token = (Token) offendingSymbol;
                processError(token, line);
            }
        });

        // 获取所有词法单元
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        // 第一遍扫描：检查错误
        for (Token token : tokens.getTokens()) {
            if (token.getType() == Token.EOF) continue;
            
            if (token.getType() == SysYLexer.ERROR_CHAR || 
                token.getType() == SysYLexer.ERROR_NUMBER) {
                hasErrors = true;
                processError(token, token.getLine());
            } else {
                // 收集正常的词法单元
                collectToken(token);
            }
        }

        // 根据是否有错误决定输出内容
        if (hasErrors) {
            // 输出所有错误信息
            printErrors();
        } else {
            // 输出所有词法单元
            printTokens();
        }
    }

    // 处理错误token
    private static void processError(Token token, int line) {
        String text = token.getText();
        
        // 先处理未定义字符
        if (token.getType() == SysYLexer.ERROR_CHAR) {
            addError(line, String.format("Illegal character '%s'", text));
            return;
        }
        
        // 处理数字错误
        if (text.startsWith("0") && text.length() > 1) {
            if (text.toLowerCase().startsWith("0x")) {
                // 检查十六进制错误
                for (int i = 2; i < text.length(); i++) {
                    char c = text.charAt(i);
                    if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F'))) {
                        addError(line, String.format("Invalid hexadecimal number '%c'", c));
                        return;
                    }
                }
            } else {
                // 检查八进制错误
                for (int i = 1; i < text.length(); i++) {
                    if (text.charAt(i) > '7') {
                        addError(line, String.format("Invalid octal number '%c'", text.charAt(i)));
                        return;
                    }
                }
            }
        }
    }

    // 收集正常的词法单元
    private static void collectToken(Token token) {
        String type = SysYLexer.VOCABULARY.getSymbolicName(token.getType());
        String text = token.getText();
        tokenList.add(String.format("<%s, %s>", type, text));
    }

    // 添加错误（避免重复）
    private static void addError(int line, String message) {
        if (errors.stream().noneMatch(e -> e.line == line && e.message.equals(message))) {
            errors.add(new Error(line, message));
        }
    }

    // 输出所有错误
    private static void printErrors() {
        errors.sort((a, b) -> a.line - b.line);
        for (Error error : errors) {
            System.err.printf("Error type A at Line %d: %s%n", error.line, error.message);
        }
    }

    // 输出所有词法单元
    private static void printTokens() {
        for (String token : tokenList) {
            System.out.println(token);
        }
    }
}
