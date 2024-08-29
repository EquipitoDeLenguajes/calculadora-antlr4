// Generated from calculadora.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculadoraParser}.
 */
public interface calculadoraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calculadoraParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(calculadoraParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculadoraParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(calculadoraParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link calculadoraParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(calculadoraParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link calculadoraParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(calculadoraParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calculadoraParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(calculadoraParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calculadoraParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(calculadoraParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link calculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(calculadoraParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link calculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(calculadoraParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Abs}
	 * labeled alternative in {@link calculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAbs(calculadoraParser.AbsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Abs}
	 * labeled alternative in {@link calculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAbs(calculadoraParser.AbsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link calculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegative(calculadoraParser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link calculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegative(calculadoraParser.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link calculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(calculadoraParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link calculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(calculadoraParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link calculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(calculadoraParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link calculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(calculadoraParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link calculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloat(calculadoraParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link calculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloat(calculadoraParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link calculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(calculadoraParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link calculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(calculadoraParser.IntContext ctx);
}