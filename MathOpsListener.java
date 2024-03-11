// Generated from C:/Users/khali/OneDrive/Documents/CS 320/Coding Assignment 3-1/src/MathOps.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MathOpsParser}.
 */
public interface MathOpsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code finalExpr}
	 * labeled alternative in {@link MathOpsParser#file_}.
	 * @param ctx the parse tree
	 */
	void enterFinalExpr(MathOpsParser.FinalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code finalExpr}
	 * labeled alternative in {@link MathOpsParser#file_}.
	 * @param ctx the parse tree
	 */
	void exitFinalExpr(MathOpsParser.FinalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParen(MathOpsParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParen(MathOpsParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegation(MathOpsParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegation(MathOpsParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Func}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunc(MathOpsParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Func}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunc(MathOpsParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(MathOpsParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(MathOpsParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(MathOpsParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(MathOpsParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNum(MathOpsParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNum(MathOpsParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPow(MathOpsParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPow(MathOpsParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fact}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFact(MathOpsParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fact}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFact(MathOpsParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathOpsParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(MathOpsParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathOpsParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(MathOpsParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathOpsParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(MathOpsParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathOpsParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(MathOpsParser.ScientificContext ctx);
}