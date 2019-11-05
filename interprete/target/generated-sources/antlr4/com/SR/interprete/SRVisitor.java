// Generated from com\SR\interprete\SR.g4 by ANTLR 4.5.1
package com.SR.interprete;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SRParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SRVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SRParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SRParser.StartContext ctx);
}