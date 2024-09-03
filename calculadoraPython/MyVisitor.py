from calculadoraVisitor import calculadoraVisitor
from calculadoraParser import calculadoraParser


class MyVisitor(calculadoraVisitor):

    def __init__(self):
        self.memory = {}

    def visitPrintExpr(self, ctx: calculadoraParser.PrintExprContext):
        value = self.visit(ctx.expr())
        return value

    def visitAssign(self, ctx: calculadoraParser.AssignContext):
        var_name = ctx.ID().getText()
        value = self.visit(ctx.expr())
        self.memory[var_name] = value
        return None  # No se imprime nada cuando es una asignación

    def visitInt(self, ctx):
        return int(ctx.INT().getText())

    def visitFloat(self, ctx):
        return float(ctx.FLOAT().getText())

    def visitNegative(self, ctx: calculadoraParser.NegativeContext):
        value = self.visit(ctx.expr())
        return -value

    def visitMulDiv(self, ctx):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        if ctx.op.type == calculadoraParser.MUL:
            return left * right
        if right == 0:
            raise ValueError("Error: Division por cero")
        return left / right

    def visitAbs(self, ctx):
        value = self.visit(ctx.expr())
        return abs(value)

    def visitAddSub(self, ctx: calculadoraParser.AddSubContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        if ctx.op.type == calculadoraParser.ADD:
            return left + right
        else:
            return left - right

    def visitId(self, ctx: calculadoraParser.IdContext):
        var_name = ctx.ID().getText()
        if var_name in self.memory:
            return self.memory[var_name]
        raise ValueError(f"Variable '{var_name}' no definida")

    def visitParens(self, ctx):
        return self.visit(ctx.expr())
