/*Khalil Coats
March 10, 2024,
CS 320 Coding Assignment 3
Collaborated with Aman Khera
 */

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.util.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = "";
        boolean RPNContinue = false;
        while (RPNContinue == false) {
            System.out.print("Please enter an expression or type 'end' to exit program:");
            expression = input.nextLine();
            System.out.println();
            if (expression.equals("end")) {
                System.out.println("Program has exited! Have a good day!");
                RPNContinue = true;
                continue;
            }
            try {
                CharStream charStream = CharStreams.fromString(expression);
                MathOpsLexer lexer = new MathOpsLexer(charStream);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                MathOpsParser parser = new MathOpsParser(tokens);

                //removes any errors that maybe caused by inputting characters that are not within the grammar
                parser.removeErrorListeners(); // remove the default error listener
                parser.addErrorListener(new BaseErrorListener() {
                    @Override
                    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                        throw new IllegalArgumentException("Invalid expression at line " + line + " position " + charPositionInLine + ": " + msg, e);
                    }
                });

                MathOpsParser parseExpr = createparser(expression);
                CalcVisitor visitor = new CalcVisitor();
                Number value = visitor.visit(parseExpr.file_());

                parseExpr = createparser(expression);

                ParseTree tree = parseExpr.file_();
                // Create an instance of ReverseGrammarRPN and visit the parse tree
                RPNGenerator Rpns = new RPNGenerator();
                String rpn = buildRPN(Rpns, tree);
                System.out.println("Infix expression: " + expression + "\nReverse Polish Expression: " + rpn + "\nComputation Result: " + value);
            } catch (Exception e) {
                System.out.println("Please input a valid expression");
            }
        }
    }

    public static MathOpsParser createparser(String input) {
        CharStream inputCharStream = CharStreams.fromString(input);
        MathOpsLexer lexer = new MathOpsLexer(inputCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MathOpsParser parseExpr = new MathOpsParser(tokens);
        return parseExpr;
    }

    public static String buildRPN(RPNGenerator prnt, ParseTree tree) {
        String rpn = "";
        prnt.visit(tree);
        while (!prnt.RPNStack.isEmpty()) {
            rpn += prnt.RPNStack.pop() + " ";
        }
        return rpn;
    }
}
