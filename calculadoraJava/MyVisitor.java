import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class MyVisitor extends calculadoraBaseVisitor<Double> {
    private Map<String, Double> memory = new HashMap<>();

    @Override
    public Double visitAssign(calculadoraParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        Double value = visit(ctx.expr());
        memory.put(id, value);
        return value;
    }

    @Override
    public Double visitId(calculadoraParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) {
            return memory.get(id);
        }
        return 0.0;
    }
    
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
            if (right == 0) {
                System.out.print("Error: division por ");
                return 0.0;
            } else {
                return left / right;
            }
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
