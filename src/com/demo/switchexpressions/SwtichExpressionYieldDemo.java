package com.demo.switchexpressions;

public class SwtichExpressionYieldDemo {

	public static void main(String[] args) {
		int day = 3;
		String dayName = switch(day) {
			case 1:
				System.out.println("The value of the day is: " + day);
				yield "Monday";
			case 2:
				System.out.println("The value of the day is: " + day);
				yield "Tuesday";
			case 3:
				System.out.println("The value of the day is: " + day);
				yield "Wednesday";
			case 4:
				System.out.println("The value of the day is: " + day);
				yield "Thursday";
			case 5:
				System.out.println("The value of the day is: " + day);
				yield "Friday";
			case 6:
				System.out.println("The value of the day is: " + day);
				yield "Saturday";
			case 7:
				System.out.println("The value of the day is: " + day);
				yield "Sunday";
			default:
				System.out.println("Invalid day value: " + day);
				yield "Invalid day value";
		};
		
		System.out.println("The day is: " + dayName);

	}

}
