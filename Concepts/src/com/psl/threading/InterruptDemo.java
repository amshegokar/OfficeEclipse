package com.psl.threading;

public class InterruptDemo {

	public static void main(String[] args) throws InterruptedException {

		MyThread1 t1 = new MyThread1();
		t1.start();
		t1.interrupt();

		System.out.println(" End of Main Thread..........");

	}
}

class MyThread1 extends Thread {

	public void run() {

		try {
			for (int i = 0; i < 10; i++) {

				System.out.println("I am lazy...Thread..........");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(" I got interrupted...........");
			e.printStackTrace();
		}
	}
}