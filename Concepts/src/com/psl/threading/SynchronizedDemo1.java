package com.psl.threading;

public class SynchronizedDemo1 {

	public static void main(String[] args) {
		
		Display d1=new Display();
		MyThread2 t1=new MyThread2(d1, "Dhoni");
		MyThread2 t2=new MyThread2(d1, "Yuraj");
		t1.start();
		t2.start();

	}

}


class Display{
	
	public synchronized void wish(String name) {
		
		for(int i=0;i<10;i++) {
			System.out.println("Good Morning :");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}

class MyThread2 extends Thread{
	Display d;
	String name;
	
	MyThread2(Display d,String name){
		this.d=d;
		this.name=name;
	}
	
	public void run() {
		d.wish(name);
	}
	
}