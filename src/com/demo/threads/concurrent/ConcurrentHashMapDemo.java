package com.demo.threads.concurrent;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> employee = new ConcurrentHashMap<>();
		
		employee.put(101, "John");
		employee.put(102, "Eric");
		employee.put(105, "Hans");
		
		for(Map.Entry<Integer, String> entry : employee.entrySet()) {
			
			System.out.println("Key : " + entry.getKey() + " Value: " + entry.getValue());
			employee.put(103, "Mili");
		}

	}

}
