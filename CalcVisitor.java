/*Khalil Coats
March 10, 2024,
CS 320 Coding Assignment 3
Collaborated with Aman Khera
 */

import java.lang.reflect.Type;
import java.lang.Math;
import java.text.DecimalFormat;

public class CalcVisitor extends MathOpsBaseVisitor<Number>
{
    @Override public Number visitFinalExpr(MathOpsParser.FinalExprContext ctx)
    {
        DecimalFormat round5 = new DecimalFormat("#.#####");
        if((double)visit(ctx.expression(0)) == Math.floor((Double)visit(ctx.expression(0))))
        {
            //System.out.println(visit(ctx.expression(0)));
            return visit(ctx.expression(0)).intValue();
        }
        return Double.valueOf(round5.format((double)visit(ctx.expression(0))));
    }

    @Override public Number visitParen(MathOpsParser.ParenContext ctx)
    {
        return visit(ctx.expression());
    }
    /*
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Number visitFunc(MathOpsParser.FuncContext ctx)
    {
        return switch(ctx.op.getType())
        {
            case MathOpsParser.SIN -> Math.sin((Double)visit( ctx.expression()));
            case MathOpsParser.COS -> Math.cos((Double)visit( ctx.expression()));
            case MathOpsParser.TAN -> Math.tan((Double)visit( ctx.expression()));
            case MathOpsParser.ASIN -> Math.asin((Double)visit( ctx.expression()));
            case MathOpsParser.ACOS -> Math.acos((Double)visit( ctx.expression()));
            case MathOpsParser.ATAN -> Math.atan((Double)visit( ctx.expression()));
            case MathOpsParser.SINH -> Math.sinh((Double)visit( ctx.expression()));
            case MathOpsParser.COSH -> Math.cosh((Double)visit( ctx.expression()));
            case MathOpsParser.TANH -> Math.tanh((Double)visit( ctx.expression()));
            case MathOpsParser.BASE10 -> Math.log10((Double)visit( ctx.expression()));
            case MathOpsParser.BASEe -> Math.log((Double)visit( ctx.expression()));
            default ->  throw new RuntimeException("Function DNE");


        };
    }

    /**
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Number visitMulDiv(MathOpsParser.MulDivContext ctx)
    {
        //DecimalFormat round5 = new DecimalFormat("#.#####");
        double left = (double)visit(ctx.expression(0)); // get value of left subexpression
        double right = (double)visit(ctx.expression(1)); // get value of right subexpression
        if ( ctx.op.getType() == MathOpsParser.TIMES)
        {
            return left * right;
        }
         else if ( ctx.op.getType() == MathOpsParser.DIV) {
            return left / right;
        }
        return left / right;
    }
    /**
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Number visitAddSub(MathOpsParser.AddSubContext ctx)
    {
        double left = (double) visit(ctx.expression(0)); // get value of left subexpression
        double right = (double) visit(ctx.expression(1)); // get value of right subexpression
        if ( ctx.op.getType() == MathOpsParser.PLUS)
        {
            return left + right;
        } else if (ctx.op.getType() == MathOpsParser.MINUS)
        {
                return left - right;
        }
        return left - right;

    }
    /**
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Number visitNum(MathOpsParser.NumContext ctx)
    {
        if((ctx.atom().getText().equals("e")))
        {
            return Math.exp(1);
        } else if ((ctx.atom().getText().equals("π")))
        {
            return Math.PI;
        }

        return (double)Double.valueOf(ctx.atom().getText());
    }
    /**
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Number visitPow(MathOpsParser.PowContext ctx)
    {
        Double left = (Double)visit(ctx.expression(0)); // get value of left subexpression
        Double right = (Double)visit(ctx.expression(1)); // get value of right subexpression
        return (double)Math.pow(left, right);
    }
    /**
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Number visitFact(MathOpsParser.FactContext ctx)
    {
        //System.out.println((Double)visit(ctx.expression()));
        //System.out.println((Double) Math.floor((Double) visit(ctx.expression())));
        if(!visit(ctx.expression()).equals ((Double) Math.floor((Double) visit(ctx.expression()))) || (Double)Math.floor((Double) visit(ctx.expression())) < 0)
        {
            throw new RuntimeException("Factorials of Positive Integer Bases Only");
        }
        double factorial = (double) visit(ctx.expression());
        if((Double)visit(ctx.expression()) == Math.floor((Double) visit(ctx.expression())))
            for(double i = (double)visit(ctx.expression())-1; i >= 1; i--)
            {
                factorial *= i;
            }
        return factorial;
    }
    /**
     * {@link #visitChildren} on {@code ctx}.</p>
     */

    @Override public Number visitNegation(MathOpsParser.NegationContext ctx)
    {
        return -1 * (double) this.visit(ctx.right);
    }
}
