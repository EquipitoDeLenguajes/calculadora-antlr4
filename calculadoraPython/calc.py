import sys
from antlr4 import *
from antlr4.InputStream import InputStream
from calculadoraLexer import calculadoraLexer
from calculadoraParser import calculadoraParser
from MyVisitor import MyVisitor

if __name__ == '__main__':
    if len(sys.argv) > 1:
        input_stream = FileStream(sys.argv[1])
    else:
        input_stream = InputStream(sys.stdin.readline())

    lexer = calculadoraLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = calculadoraParser(token_stream)
    tree = parser.prog()

    visitor = MyVisitor()
    visitor.visit(tree)
