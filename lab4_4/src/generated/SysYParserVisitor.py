# Generated from SysYParser.g4 by ANTLR 4.9.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SysYParser import SysYParser
else:
    from SysYParser import SysYParser

# This class defines a complete generic visitor for a parse tree produced by SysYParser.

class SysYParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by SysYParser#program.
    def visitProgram(self, ctx:SysYParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#compUnit.
    def visitCompUnit(self, ctx:SysYParser.CompUnitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#decl.
    def visitDecl(self, ctx:SysYParser.DeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#constDecl.
    def visitConstDecl(self, ctx:SysYParser.ConstDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#bType.
    def visitBType(self, ctx:SysYParser.BTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#constDef.
    def visitConstDef(self, ctx:SysYParser.ConstDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#constInitVal.
    def visitConstInitVal(self, ctx:SysYParser.ConstInitValContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#varDecl.
    def visitVarDecl(self, ctx:SysYParser.VarDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#varDef.
    def visitVarDef(self, ctx:SysYParser.VarDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#initVal.
    def visitInitVal(self, ctx:SysYParser.InitValContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#funcDef.
    def visitFuncDef(self, ctx:SysYParser.FuncDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#funcType.
    def visitFuncType(self, ctx:SysYParser.FuncTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#funcFParams.
    def visitFuncFParams(self, ctx:SysYParser.FuncFParamsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#funcFParam.
    def visitFuncFParam(self, ctx:SysYParser.FuncFParamContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#block.
    def visitBlock(self, ctx:SysYParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#blockItem.
    def visitBlockItem(self, ctx:SysYParser.BlockItemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#stmt.
    def visitStmt(self, ctx:SysYParser.StmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#exp.
    def visitExp(self, ctx:SysYParser.ExpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#cond.
    def visitCond(self, ctx:SysYParser.CondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#lVal.
    def visitLVal(self, ctx:SysYParser.LValContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#number.
    def visitNumber(self, ctx:SysYParser.NumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#unaryOp.
    def visitUnaryOp(self, ctx:SysYParser.UnaryOpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#funcRParams.
    def visitFuncRParams(self, ctx:SysYParser.FuncRParamsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#param.
    def visitParam(self, ctx:SysYParser.ParamContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SysYParser#constExp.
    def visitConstExp(self, ctx:SysYParser.ConstExpContext):
        return self.visitChildren(ctx)



del SysYParser