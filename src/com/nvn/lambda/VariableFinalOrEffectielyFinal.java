package com.nvn.lambda;

import java.util.function.Consumer;

public class VariableFinalOrEffectielyFinal {
	public static void main(String[] args) {
		String abc = "abc";
		Consumer<String> con = a -> System.out.println(a);
		abc = "def"; // Compilation error at this line.
		con.accept(abc);
		abc = "ghi";
		con.accept(abc);
	}
}
