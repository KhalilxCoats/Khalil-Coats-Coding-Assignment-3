// Generated from C:/Users/khali/OneDrive/Documents/CS 320/Coding Assignment 3-1/src/MathOps.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MathOpsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MathOpsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code finalExpr}
	 * labeled alternative in {@link MathOpsParser#file_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalExpr(MathOpsParser.FinalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(MathOpsParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(MathOpsParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Func}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(MathOpsParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(MathOpsParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(MathOpsParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(MathOpsParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(MathOpsParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fact}
	 * labeled alternative in {@link MathOpsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(MathOpsParser.FactContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathOpsParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(MathOpsParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathOpsParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(MathOpsParser.ScientificContext ctx);
}