# Generated from SysYParser.g4 by ANTLR 4.9.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SysYParser import SysYParser
else:
    from SysYParser import SysYParser

# This class defines a complete listener for a parse tree produced by SysYParser.
class SysYParserListener(ParseTreeListener):

    # Enter a parse tree produced by SysYParser#program.
    def enterProgram(self, ctx:SysYParser.ProgramContext):
        pass

    # Exit a parse tree produced by SysYParser#program.
    def exitProgram(self, ctx:SysYParser.ProgramContext):
        pass


    # Enter a parse tree produced by SysYParser#compUnit.
    def enterCompUnit(self, ctx:SysYParser.CompUnitContext):
        pass

    # Exit a parse tree produced by SysYParser#compUnit.
    def exitCompUnit(self, ctx:SysYParser.CompUnitContext):
        pass


    # Enter a parse tree produced by SysYParser#decl.
    def enterDecl(self, ctx:SysYParser.DeclContext):
        pass

    # Exit a parse tree produced by SysYParser#decl.
    def exitDecl(self, ctx:SysYParser.DeclContext):
        pass


    # Enter a parse tree produced by SysYParser#constDecl.
    def enterConstDecl(self, ctx:SysYParser.ConstDeclContext):
        pass

    # Exit a parse tree produced by SysYParser#constDecl.
    def exitConstDecl(self, ctx:SysYParser.ConstDeclContext):
        pass


    # Enter a parse tree produced by SysYParser#bType.
    def enterBType(self, ctx:SysYParser.BTypeContext):
        pass

    # Exit a parse tree produced by SysYParser#bType.
    def exitBType(self, ctx:SysYParser.BTypeContext):
        pass


    # Enter a parse tree produced by SysYParser#constDef.
    def enterConstDef(self, ctx:SysYParser.ConstDefContext):
        pass

    # Exit a parse tree produced by SysYParser#constDef.
    def exitConstDef(self, ctx:SysYParser.ConstDefContext):
        pass


    # Enter a parse tree produced by SysYParser#constInitVal.
    def enterConstInitVal(self, ctx:SysYParser.ConstInitValContext):
        pass

    # Exit a parse tree produced by SysYParser#constInitVal.
    def exitConstInitVal(self, ctx:SysYParser.ConstInitValContext):
        pass


    # Enter a parse tree produced by SysYParser#varDecl.
    def enterVarDecl(self, ctx:SysYParser.VarDeclContext):
        pass

    # Exit a parse tree produced by SysYParser#varDecl.
    def exitVarDecl(self, ctx:SysYParser.VarDeclContext):
        pass


    # Enter a parse tree produced by SysYParser#varDef.
    def enterVarDef(self, ctx:SysYParser.VarDefContext):
        pass

    # Exit a parse tree produced by SysYParser#varDef.
    def exitVarDef(self, ctx:SysYParser.VarDefContext):
        pass


    # Enter a parse tree produced by SysYParser#initVal.
    def enterInitVal(self, ctx:SysYParser.InitValContext):
        pass

    # Exit a parse tree produced by SysYParser#initVal.
    def exitInitVal(self, ctx:SysYParser.InitValContext):
        pass


    # Enter a parse tree produced by SysYParser#funcDef.
    def enterFuncDef(self, ctx:SysYParser.FuncDefContext):
        pass

    # Exit a parse tree produced by SysYParser#funcDef.
    def exitFuncDef(self, ctx:SysYParser.FuncDefContext):
        pass


    # Enter a parse tree produced by SysYParser#funcType.
    def enterFuncType(self, ctx:SysYParser.FuncTypeContext):
        pass

    # Exit a parse tree produced by SysYParser#funcType.
    def exitFuncType(self, ctx:SysYParser.FuncTypeContext):
        pass


    # Enter a parse tree produced by SysYParser#funcFParams.
    def enterFuncFParams(self, ctx:SysYParser.FuncFParamsContext):
        pass

    # Exit a parse tree produced by SysYParser#funcFParams.
    def exitFuncFParams(self, ctx:SysYParser.FuncFParamsContext):
        pass


    # Enter a parse tree produced by SysYParser#funcFParam.
    def enterFuncFParam(self, ctx:SysYParser.FuncFParamContext):
        pass

    # Exit a parse tree produced by SysYParser#funcFParam.
    def exitFuncFParam(self, ctx:SysYParser.FuncFParamContext):
        pass


    # Enter a parse tree produced by SysYParser#block.
    def enterBlock(self, ctx:SysYParser.BlockContext):
        pass

    # Exit a parse tree produced by SysYParser#block.
    def exitBlock(self, ctx:SysYParser.BlockContext):
        pass


    # Enter a parse tree produced by SysYParser#blockItem.
    def enterBlockItem(self, ctx:SysYParser.BlockItemContext):
        pass

    # Exit a parse tree produced by SysYParser#blockItem.
    def exitBlockItem(self, ctx:SysYParser.BlockItemContext):
        pass


    # Enter a parse tree produced by SysYParser#stmt.
    def enterStmt(self, ctx:SysYParser.StmtContext):
        pass

    # Exit a parse tree produced by SysYParser#stmt.
    def exitStmt(self, ctx:SysYParser.StmtContext):
        pass


    # Enter a parse tree produced by SysYParser#exp.
    def enterExp(self, ctx:SysYParser.ExpContext):
        pass

    # Exit a parse tree produced by SysYParser#exp.
    def exitExp(self, ctx:SysYParser.ExpContext):
        pass


    # Enter a parse tree produced by SysYParser#cond.
    def enterCond(self, ctx:SysYParser.CondContext):
        pass

    # Exit a parse tree produced by SysYParser#cond.
    def exitCond(self, ctx:SysYParser.CondContext):
        pass


    # Enter a parse tree produced by SysYParser#lVal.
    def enterLVal(self, ctx:SysYParser.LValContext):
        pass

    # Exit a parse tree produced by SysYParser#lVal.
    def exitLVal(self, ctx:SysYParser.LValContext):
        pass


    # Enter a parse tree produced by SysYParser#number.
    def enterNumber(self, ctx:SysYParser.NumberContext):
        pass

    # Exit a parse tree produced by SysYParser#number.
    def exitNumber(self, ctx:SysYParser.NumberContext):
        pass


    # Enter a parse tree produced by SysYParser#unaryOp.
    def enterUnaryOp(self, ctx:SysYParser.UnaryOpContext):
        pass

    # Exit a parse tree produced by SysYParser#unaryOp.
    def exitUnaryOp(self, ctx:SysYParser.UnaryOpContext):
        pass


    # Enter a parse tree produced by SysYParser#funcRParams.
    def enterFuncRParams(self, ctx:SysYParser.FuncRParamsContext):
        pass

    # Exit a parse tree produced by SysYParser#funcRParams.
    def exitFuncRParams(self, ctx:SysYParser.FuncRParamsContext):
        pass


    # Enter a parse tree produced by SysYParser#param.
    def enterParam(self, ctx:SysYParser.ParamContext):
        pass

    # Exit a parse tree produced by SysYParser#param.
    def exitParam(self, ctx:SysYParser.ParamContext):
        pass


    # Enter a parse tree produced by SysYParser#constExp.
    def enterConstExp(self, ctx:SysYParser.ConstExpContext):
        pass

    # Exit a parse tree produced by SysYParser#constExp.
    def exitConstExp(self, ctx:SysYParser.ConstExpContext):
        pass



del SysYParser