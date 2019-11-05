
package com.SR.interprete;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "sr";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		SRLexer lexer = new SRLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SRParser parser = new SRParser(tokens);

		SRParser.ComponentContext tree = parser.component();

		SRCustomVisitor visitor = new SRCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
