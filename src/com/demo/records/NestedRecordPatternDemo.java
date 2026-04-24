package com.demo.records;


record Person(String name, Address address) { }
record Address(String city, String country) { }

public class NestedRecordPatternDemo {

	public static void main(String[] args) {
		Person person = new Person ("John Doe", new Address("New York City", "USA"));
		
		if(person instanceof Person(String name, Address(String city, String country))) {
			System.out.println("Name:    " + name);
			System.out.println("City:    " + city);
			System.out.println("Country: " + country);
		}

	}

}