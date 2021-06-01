package com.nvn.generic;

// It gives Null pointer exception 
public class BooleanNullTest {
	public static void main(String[] args) {
		Boolean nvnverma = null;
		boolean nvn = nvnverma;
		if (nvn)
			System.out.println("in if");
		else
			System.out.println("in else");
	}
}
