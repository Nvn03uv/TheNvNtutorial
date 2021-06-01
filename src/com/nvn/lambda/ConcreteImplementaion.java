package com.nvn.lambda;

public class ConcreteImplementaion implements MyFunctionalInterface {
	@Override
	public void accept(String t) {
		System.out.println(t);
	}
}
