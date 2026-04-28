package com.demo.switchexpressions.patternmatching;

import java.util.function.Function;

public class ParenthesizedPatternMatchingDemo {
	
	static Function<Integer, String> testPattern(Object obj){
		boolean b = true;
		return switch(obj) {
		case (String s && b) -> t -> s;
		default -> t -> "Default string";
		};
	}

	public static void main(String[] args) {
		Object object1 = "Hello";
		Object object2 = 123;
		
		Function<Integer, String> result1 = testPattern(object1);
		Function<Integer, String> result2 = testPattern(object2);
		
		String stringResult1 = result1.apply(42);
		String stringResult2 = result2.apply(42);

		System.out.println("Result 1 : " + stringResult1);
		System.out.println("Result 2 : " + stringResult2);
	}

}
