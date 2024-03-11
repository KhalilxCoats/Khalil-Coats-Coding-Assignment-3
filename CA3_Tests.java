/*Khalil Coats
March 10, 2024,
CS 320 Coding Assignment 3
Collaborated with Aman Khera
 */

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Coding Assignment 3 Test class
class CA3_Tests
{
    //assignment expression example 1 computation test
    @Test
    void testCalculation1()
    {
        MathOpsParser parser = createparser("(1+2)!÷(3-4**2)");
        CalcVisitor visitor = new CalcVisitor();
        Number value = visitor.visit(parser.file_());
        assertEquals(value,-0.46154);
    }

    //assignment expression example 2 computation test
    @Test
    void testCalculation2()
    {
        MathOpsParser parser = createparser("sin(π÷6)");
        CalcVisitor visitor = new CalcVisitor();
        Number value = visitor.visit(parser.file_());
        assertEquals(value,.5);
    }

    //assignment expression example 3 computation test
    @Test
    void testCalculation3()
    {
        MathOpsParser parser = createparser("ln(e**3)");
        CalcVisitor visitor = new CalcVisitor();
        Number value = visitor.visit(parser.file_());
        assertEquals(value,3);
    }

    //test trig function raised to exponent
    @Test
    void testCalculation4()
    {
        MathOpsParser parser = createparser("sin(π÷4)**(1÷2)");
        CalcVisitor visitor = new CalcVisitor();
        Number value = visitor.visit(parser.file_());
        assertEquals(value,.8409);
    }

    //test base10 log function
    @Test
    void testCalculation5()
    {
        MathOpsParser parser = createparser("log(1000000)");
        CalcVisitor visitor = new CalcVisitor();
        Number value = visitor.visit(parser.file_());
        assertEquals(value,6);
    }

    //assignment expression example 1 reverse polish notation test
    @Test
    void testRpn1()
    {
        MathOpsParser parser = createparser("(1+2)!÷(3-4**2)");
        RPNGenerator rpn = new RPNGenerator();
        ParseTree tree = parser.file_();
        assertEquals(buildRPN(rpn,tree),"1 2 + ! 3 4 2 ** - ÷ ");
    }

    //assignment expression example 2 reverse polish notation test
    @Test
    void testRpn2()
    {
        MathOpsParser parser = createparser("sin(π÷6)");
        RPNGenerator rpn = new RPNGenerator();
        ParseTree tree = parser.file_();
        assertEquals(buildRPN(rpn,tree),"π 6 ÷ sin ");
    }

    //assignment expression example 3 reverse polish notation test
    @Test
    void testRpn3()
    {
        MathOpsParser parser = createparser("ln(e**3)");
        RPNGenerator rpn = new RPNGenerator();
        ParseTree tree = parser.file_();
        assertEquals(buildRPN(rpn,tree),"e 3 ** ln ");
    }

    //assures that factorials can't have negative base
    @Test
    void testThrows1()
    {
        Exception exception = assertThrows(RuntimeException.class, () ->
        {
            MathOpsParser parser = createparser("(1-4)!");
            CalcVisitor visitor = new CalcVisitor();
            Number value = visitor.visit(parser.file_());
            System.out.print(value);
        });

        String expectedMessage = "Factorials of Positive Integer Bases Only";
        String actualMessage = exception.getMessage();

        assertEquals(actualMessage,expectedMessage);
    }
    @Test
    void testThrows2()
    {
        Exception exception = assertThrows(RuntimeException.class, () ->
        {
            MathOpsParser parser = createparser("(3÷2)!");
            CalcVisitor visitor = new CalcVisitor();
            Number value = visitor.visit(parser.file_());
            System.out.print(value);
        });

        String expectedMessage = "Factorials of Positive Integer Bases Only";
        String actualMessage = exception.getMessage();

        assertEquals(actualMessage,expectedMessage);
    }

    //makes new parsers with given expression input string
    public MathOpsParser createparser(String input)
    {
        CharStream inputCharStream = CharStreams.fromString(input);
        MathOpsLexer lexer = new MathOpsLexer(inputCharStream);
        CommonTokenStream tokens= new CommonTokenStream(lexer);
        MathOpsParser parseExpr = new MathOpsParser(tokens);
        return parseExpr;
    }

    //creates expression in reverses polish notation given parse tree and rpnVisitor
    public String buildRPN(RPNGenerator prnt, ParseTree tree)
    {
        String rpn = "";
        prnt.visit(tree);
        while (!prnt.RPNStack.isEmpty()) {
            rpn += prnt.RPNStack.pop() + " ";
            //System.out.print(prnt.RPNStack.pop() + " ");
        }
        return rpn;
    }
}