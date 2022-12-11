package com.touchsun.jvm.core.antlr;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LwParser}.
 */
public interface LwListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LwParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(LwParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LwParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(LwParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link LwParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LwParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LwParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LwParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LwParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LwParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LwParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LwParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link LwParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LwParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LwParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LwParser.ValueContext ctx);
}