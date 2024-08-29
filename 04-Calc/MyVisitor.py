from calculadoraVisitor import calculadoraVisitor
from calculadoraParser import calculadoraParser


class MyVisitor(calculadoraVisitor):

    def visitPrintExpr(self, ctx: calculadoraParser.PrintExprContext):
        value = self.visit(ctx.expr())
        print(value)
        return value

    def visitInt(self, ctx):
        return int(ctx.INT().getText())

    def visitFloat(self, ctx):
        return float(ctx.FLOAT().getText())

    def visitMulDiv(self, ctx):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        if ctx.op.type == calculadoraParser.MUL:
            return left * right
        if right == 0:
            return "División por cero no aceptada"
        return left / right
    
    def visitAbs(self,ctx):
        value = self.visit(ctx.expr())
        return abs((value))
    

    def visitAddSub(self, ctx: calculadoraParser.AddSubContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        if ctx.op.type == calculadoraParser.ADD:
            return left + right
        else:
            return left - right

    def visitParens(self, ctx):
        return self.visit(ctx.expr())
