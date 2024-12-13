import org.antlr.v4.runtime.*;

import java.util.BitSet;

import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class LexerErrorListener extends BaseErrorListener {
class OutputErrHelper {
        private int lastLine = -1;

        public void PrintHelper(int line, String msg) {
            if (lastLine == line ) {
                return;
            }
            final String ANSI_RED = "\u001B[31m";
            final String ANSI_RESET = "\u001B[0m";
            System.out.println(ANSI_RED + "Error type Lexer at line " + line + ": " + msg + ANSI_RESET);
            lastLine = line;
        }

        public boolean HasError() {
            return lastLine != -1;
        }
    }

    private OutputErrHelper put =  new OutputErrHelper();
    private boolean haserr = false;

    public LexerErrorListener() {
    }

    public boolean hasErr() {
        return haserr;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                            String msg, RecognitionException e) {
        put.PrintHelper(line, msg);
        haserr = true;
    }

}

