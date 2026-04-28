package com.demo.switchexpressions.patternmatching;

public class GuardedPatternMatchingDemo {
	
	static void test(Object obj) {
		switch(obj) {
		case String s && (s.length()==1) -> System.out.println("Short: " + s);
		case String s -> System.out.println(s);
		default -> System.out.println("Not a string");
		}
	}

	public static void main(String[] args) {
		
		Object object1 = "H";
		Object object2 = "Hello";
		Object object3 = 123;
		
		test(object1);
		test(object2);
		test(object3);
	}

}
