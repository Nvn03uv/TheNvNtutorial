package com.nvn.enum1.constructor;

public enum EnumConstructorExample {

	// this will call enum constructor with one String argument
	RED("wait"), GREEN("go"), ORANGE("slow down");

	private String action;

	public String getAction() {
		return this.action;
	}

	// enum constructor - can not be public or protected
	EnumConstructorExample(String action) {
		this.action = action;
	}
}
