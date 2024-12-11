import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;

public class Main {
    // 添加静态变量记录是否有错误
    static boolean hasError = false;

    public static void main(String[] args) throws IOException {
        // 确保程序接受文件路径作为参数
        if (args.length != 1) {
            System.out.println("Usage: java Main <file_path>");
            return;
        }

        // 读取文件中的源代码
        String filePath = args[0];
        InputStream inputStream = new FileInputStream(filePath);
        CharStream input = CharStreams.fromStream(inputStream);

        // 创建词法分析器
        SysYLexer lexer = new SysYLexer(input);

        // 移除默认的错误监听器，并添加自定义的错误监听器
        lexer.removeErrorListeners();
        lexer.addErrorListener(new MyErrorListener());

        // 获取所有的 tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();  // 执行词法分析

        // 检查并处理所有 Token
        List<Token> tokenList = tokens.getTokens();
        int size = tokenList.size();
        List<String> outputTokens = new ArrayList<>(); // 用于存储输出的词法单元

        for (int i = 0; i < size; i++) {
            Token token = tokenList.get(i);
            int type = token.getType();
            String text = token.getText();

            // 跳过 EOF token
            if (type == Token.EOF) {
                continue;
            }

            // 处理非法字符
            if (type == SysYLexer.ILLEGAL_CHAR) {
                System.out.println("Error type A at line " + token.getLine() + ": Illegal character '" + text + "'");
                hasError = true;
                continue;
            }

            // 处理无效的八进制数字
            if (type == SysYLexer.OCT) {
                if (i + 1 < size) {
                    Token nextToken = tokenList.get(i + 1);
                    if (nextToken.getType() == SysYLexer.DECI || nextToken.getType() == SysYLexer.IDent) {
                        String combinedText = text + nextToken.getText();
                        if (!isValidOctal(combinedText)) {
                            System.out.println("Error type A at line " + token.getLine() + ": Invalid octal number '" + combinedText + "'");
                            hasError = true;
                            i++; // 跳过下一个 token，因为它已经被处理
                            continue;
                        }
                    }
                }
            }

            // 处理无效的十六进制数字
            if (type == SysYLexer.HEX) {
                if (i + 1 < size) {
                    Token nextToken = tokenList.get(i + 1);
                    if (nextToken.getType() == SysYLexer.IDent) {
                        String combinedText = text + nextToken.getText();
                        if (!isValidHex(combinedText)) {
                            System.out.println("Error type A at line " + token.getLine() + ": Invalid hexadecimal number '" + combinedText + "'");
                            hasError = true;
                            i++; // 跳过下一个 token，因为它已经被处理
                            continue;
                        }
                    }
                }
            }

            // 收集有效的词法单元
            String tokenTypeName = SysYLexer.VOCABULARY.getSymbolicName(type);
            if (tokenTypeName == null) { // 未定义的 token 类型
                tokenTypeName = "UNKNOWN";
            }
            outputTokens.add("<" + tokenTypeName + ", " + text + ">");
        }

        // 循环结束后，根据 hasError 决定是否输出词法单元
        if (!hasError) {
            for (String output : outputTokens) {
                System.out.println(output);
            }
        }
    }

    // Helper method to check if a string is a valid octal number
    private static boolean isValidOctal(String text) {
        // 八进制数字以'0'开头，后跟[0-7]+
        if (!text.startsWith("0")) {
            return false;
        }
        // 检查'0'后面的每个字符是否在[0-7]范围内
        for (int i = 1; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < '0' || c > '7') {
                return false;
            }
        }
        return true;
    }

    // Helper method to check if a string is a valid hexadecimal number
    private static boolean isValidHex(String text) {
        // 十六进制数字以'0x'或'0X'开头，后跟[0-9a-fA-F]+
        if (!(text.startsWith("0x") || text.startsWith("0X"))) {
            return false;
        }
        // 检查'0x'后面的每个字符是否在[0-9a-fA-F]范围内
        for (int i = 2; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!Character.isDigit(c) && !(c >= 'a' && c <= 'f') && !(c >= 'A' && c <= 'F')) {
                return false;
            }
        }
        return true;
    }

    // 自定义错误监听器，用于处理非法字符
    static class MyErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                int line, int charPositionInLine, String msg, RecognitionException e) {
            // 设置错误标志为 true
            hasError = true;

            // 处理非法字符
            if (offendingSymbol instanceof Token) {
                Token token = (Token) offendingSymbol;
                if (msg.startsWith("token recognition error at: '")) {
                    String illegalChar = token.getText();
                    System.out.println("Error type A at line " + line + ": Illegal character '" + illegalChar + "'");
                }
            }
        }
    }
}
