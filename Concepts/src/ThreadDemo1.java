import java.util.TreeSet;

public class ThreadDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println(ThreadDemo1.class);
		
		TreeSet ts=new TreeSet();
		ts.add(null);
		MyThread t=new MyThread();
		
		Thread t1=new Thread(t,"T1");
		Thread t2=new Thread(t,"T2");
		Thread t3=new Thread(t,"T3");
		Thread t4=new Thread(t,"T4");
		Thread t5=new Thread(t,"T5");
		
		t1.start();		
		t1.join();
		
		t2.start();
		t2.join();
		
		t3.start();
		t3.join();
		
		t4.start();
		t4.join();
		
		t5.start();
		t5.join();
		
		System.out.println(MyThread.sum);
	
	}
}


class MyThread implements Runnable{

	static int sum=0;
	@Override
	public void run() {
		System.out.println("The Current Thread is :"+Thread.currentThread().getName());
		for(int i=1;i<=10;i++) {
			sum=sum+i;
		}
		
	}
	
}