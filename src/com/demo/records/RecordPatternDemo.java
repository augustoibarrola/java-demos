package com.demo.records;

record User(String name, int age) {}

public class RecordPatternDemo {

	public static void main(String[] args) {
		User user = new User("Test", 35);
		checkRecord(user);

	}
	
	private static void checkRecord(Object obj) {
		if(obj instanceof User(String username, int userage)) {
			System.out.println("User name: " + username);
			System.out.println("User age:  " + userage);
		}
	}

}
