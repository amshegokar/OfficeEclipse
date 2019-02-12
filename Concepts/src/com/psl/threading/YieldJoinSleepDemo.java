package com.psl.threading;

public class YieldJoinSleepDemo {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1=new MyThread();
		t1.start();
		t1.join();
		
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread..........");
		}
		
	}
}


class MyThread extends Thread{
	
	
	public void run() {
		for(int i=0;i<10;i++) {
			//Thread.yield();
			System.out.println("Child Thread..........");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}