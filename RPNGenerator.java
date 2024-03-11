/*Khalil Coats
March 10, 2024,
CS 320 Coding Assignment 3
Collaborated with Aman Khera
 */

import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Stack;

public class RPNGenerator extends MathOpsBaseVisitor<String>
{
    Stack<String> RPNStack = new Stack<String>();
    public String visitFunc(MathOpsParser.FuncContext ctx)
    {
        String func = ctx.op.getText();
        RPNStack.push(func);
        String arg = visit(ctx.expression());

        return null;
    }

    public String visitAddSub(MathOpsParser.AddSubContext ctx){
        String op = ctx.op.getText();
        RPNStack.push(op);
        String left = visit(ctx.expression(1));
        String right = visit(ctx.expression(0));
        return null;
    }
    public String visitMulDiv(MathOpsParser.MulDivContext ctx){
        String op = ctx.op.getText();
        RPNStack.push(op);
        String left = visit(ctx.expression(1));
        String right = visit(ctx.expression(0));
        return null;
    }

    public String visitPow(MathOpsParser.PowContext ctx){
        RPNStack.push("**");
        String left = visit(ctx.expression(1));
        String right = visit(ctx.expression(0));
        return null;
    }
    public String visitScientific(MathOpsParser.ScientificContext ctx){
        RPNStack.push(String.valueOf(visit(ctx.SCIENTIFIC_NUMBER())));
        return null;
    }

    public String visitNum(MathOpsParser.NumContext ctx){
        String num = ctx.getText();
        RPNStack.push(num);
        return num;
    }



    public String visitFact(MathOpsParser.FactContext ctx){
        RPNStack.push("!");
        visit(ctx.expression());

        return null;
    }

}

