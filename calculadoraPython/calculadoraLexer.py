# Generated from calculadora.g4 by ANTLR 4.13.2
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,12,80,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,
        6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,1,0,1,0,1,1,1,
        1,1,2,1,2,1,3,1,3,1,4,1,4,1,5,1,5,1,6,1,6,1,7,1,7,1,8,4,8,43,8,8,
        11,8,12,8,44,1,8,1,8,5,8,49,8,8,10,8,12,8,52,9,8,1,8,1,8,4,8,56,
        8,8,11,8,12,8,57,3,8,60,8,8,1,9,4,9,63,8,9,11,9,12,9,64,1,10,1,10,
        5,10,69,8,10,10,10,12,10,72,9,10,1,11,4,11,75,8,11,11,11,12,11,76,
        1,11,1,11,0,0,12,1,1,3,2,5,3,7,4,9,5,11,6,13,7,15,8,17,9,19,10,21,
        11,23,12,1,0,4,1,0,48,57,2,0,65,90,97,122,3,0,48,57,65,90,97,122,
        2,0,9,9,32,32,86,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,
        0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,
        0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,1,25,1,0,0,0,3,27,1,0,0,0,
        5,29,1,0,0,0,7,31,1,0,0,0,9,33,1,0,0,0,11,35,1,0,0,0,13,37,1,0,0,
        0,15,39,1,0,0,0,17,59,1,0,0,0,19,62,1,0,0,0,21,66,1,0,0,0,23,74,
        1,0,0,0,25,26,5,61,0,0,26,2,1,0,0,0,27,28,5,40,0,0,28,4,1,0,0,0,
        29,30,5,41,0,0,30,6,1,0,0,0,31,32,5,42,0,0,32,8,1,0,0,0,33,34,5,
        47,0,0,34,10,1,0,0,0,35,36,5,43,0,0,36,12,1,0,0,0,37,38,5,45,0,0,
        38,14,1,0,0,0,39,40,5,124,0,0,40,16,1,0,0,0,41,43,7,0,0,0,42,41,
        1,0,0,0,43,44,1,0,0,0,44,42,1,0,0,0,44,45,1,0,0,0,45,46,1,0,0,0,
        46,50,5,46,0,0,47,49,7,0,0,0,48,47,1,0,0,0,49,52,1,0,0,0,50,48,1,
        0,0,0,50,51,1,0,0,0,51,60,1,0,0,0,52,50,1,0,0,0,53,55,5,46,0,0,54,
        56,7,0,0,0,55,54,1,0,0,0,56,57,1,0,0,0,57,55,1,0,0,0,57,58,1,0,0,
        0,58,60,1,0,0,0,59,42,1,0,0,0,59,53,1,0,0,0,60,18,1,0,0,0,61,63,
        7,0,0,0,62,61,1,0,0,0,63,64,1,0,0,0,64,62,1,0,0,0,64,65,1,0,0,0,
        65,20,1,0,0,0,66,70,7,1,0,0,67,69,7,2,0,0,68,67,1,0,0,0,69,72,1,
        0,0,0,70,68,1,0,0,0,70,71,1,0,0,0,71,22,1,0,0,0,72,70,1,0,0,0,73,
        75,7,3,0,0,74,73,1,0,0,0,75,76,1,0,0,0,76,74,1,0,0,0,76,77,1,0,0,
        0,77,78,1,0,0,0,78,79,6,11,0,0,79,24,1,0,0,0,8,0,44,50,57,59,64,
        70,76,1,6,0,0
    ]

class calculadoraLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    MUL = 4
    DIV = 5
    ADD = 6
    SUB = 7
    ABS = 8
    FLOAT = 9
    INT = 10
    ID = 11
    WS = 12

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'='", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'|'" ]

    symbolicNames = [ "<INVALID>",
            "MUL", "DIV", "ADD", "SUB", "ABS", "FLOAT", "INT", "ID", "WS" ]

    ruleNames = [ "T__0", "T__1", "T__2", "MUL", "DIV", "ADD", "SUB", "ABS", 
                  "FLOAT", "INT", "ID", "WS" ]

    grammarFileName = "calculadora.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


