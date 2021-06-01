package com.nvn.enum1.constructor;

public class EnumConstructorExampleMain {
	public static void main(String args[]) {
		// let's print name of each enum and there action
		// - Enum values() examples
		EnumConstructorExample[] signals = EnumConstructorExample.values();

		for (EnumConstructorExample signal : signals) {
			// Java name example - Java getter method example
			System.out.println("name : " + signal.name() + " action: " + signal.getAction());
		}
	}
}
