// Generated from SR.g4 by ANTLR 4.4
package com.SR.interprete;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SRParser}.
 */
public interface SRListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SRParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull SRParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull SRParser.StartContext ctx);
}