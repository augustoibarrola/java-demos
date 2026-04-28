package com.demo.threads.virtual;

public class VirtualThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Thread.Builder builder = Thread.ofVirtual().name("MyVirtualThread");

		Runnable task = () -> {
			System.out.println("Running thread");
		};

		Thread thread = builder.start(task);

		System.out.println("Thread name: " + thread.getName());

		thread.join();

	}

}
