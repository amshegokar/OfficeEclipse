package com.psl.java8;

public class LamdaExp {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {

			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		}

		);

		t1.start();

		Runnable r1 = () -> {

			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread 2");
			}

		};
		Thread t2 = new Thread(r1);
		t2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}
}
