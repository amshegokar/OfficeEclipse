package com.psl.executorf;

public class ExecutingTaskAync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<10;i++) {
			Thread t=new Thread(new Task());
			t.start();
		}
		System.out.println("Thread Name:"+Thread.currentThread().getName());
	}
	
	static class Task implements Runnable{
		public void run() {
			System.out.println("Thread Name:"+Thread.currentThread().getName());
		}
	}

}
