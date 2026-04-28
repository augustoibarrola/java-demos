package com.demo.switchexpressions.patternmatching;

public class PatternMatchingDemo {
	
	static void test(Object obj) {
		switch(obj) {
		case String s: 
			if(s.length() == 1) {
				System.out.println("Short: " + s);
			} else {
				System.out.println(s);
			}
			break;
			default:
				System.out.println("Not a String");
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
