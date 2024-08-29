import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class MyVisitor extends calculadoraBaseVisitor<Double> {

    @Override
    public Double visitPrintExpr(calculadoraParser.PrintExprContext ctx) {
        Double value = visit(ctx.expr());
        System.out.println(value);
        return value;
    }

    @Override
    public Double visitInt(calculadoraParser.IntContext ctx) {
        return Double.valueOf(ctx.INT().getText());
    }

    @Override
    public Double visitFloat(calculadoraParser.FloatContext ctx) {
        return Double.valueOf(ctx.FLOAT().getText());
    }

    @Override
    public Double visitMulDiv(calculadoraParser.MulDivContext ctx) {
        Double left = visit(ctx.expr(0));
        Double right = visit(ctx.expr(1));
        if (ctx.op.getType() == calculadoraParser.MUL) {
            return left * right;
        } else {
            return left / right;
        }
    }

    @Override
    public Double visitNegative(calculadoraParser.NegativeContext ctx) {
        Double value = visit(ctx.expr());
        return -value;
    }


    @Override
    public Double visitAbs(calculadoraParser.AbsContext ctx) {
        Double value = visit(ctx.expr());
        return Math.abs(value);
    }


    @Override
    public Double visitAddSub(calculadoraParser.AddSubContext ctx) {
        Double left = visit(ctx.expr(0));
        Double right = visit(ctx.expr(1));
        if (ctx.op.getType() == calculadoraParser.ADD) {
            return left + right;
        } else {
            return left - right;
        }
    }

    @Override
    public Double visitParens(calculadoraParser.ParensContext ctx) {
        return visit(ctx.expr());
    }
}
