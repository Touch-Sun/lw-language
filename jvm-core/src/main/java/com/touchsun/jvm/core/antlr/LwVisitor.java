package com.touchsun.jvm.core.antlr;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LwParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LwVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LwParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(LwParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link LwParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(LwParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LwParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LwParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link LwParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LwParser.ValueContext ctx);
}