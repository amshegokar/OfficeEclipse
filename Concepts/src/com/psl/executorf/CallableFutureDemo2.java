package com.psl.executorf;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		 

		MyCallable1[] myCallable1s= { new MyCallable1("Atul"),new MyCallable1("Shegokar"),new MyCallable1("Shegaon"),new MyCallable1("Buldhana"),
				new MyCallable1("Maharashatra"),new MyCallable1("India"),new MyCallable1("Asia"),new MyCallable1("Wolrds")};
		
		ExecutorService service = Executors.newFixedThreadPool(2);

		for (MyCallable1 printJob : myCallable1s) {
			
			Future<ArrayList<Character>> f=service.submit(printJob);
			
			ArrayList<Character> msgList=f.get();
			System.out.println(msgList);
		}
		
		
		ArrayList<String> subsriberList=new ArrayList<String>();
		
		ArrayList<String> publisherList=new ArrayList<String>();
		publisherList.add("Atul");
		publisherList.add("Shegokar");
		publisherList.add("Shegaon");
		publisherList.add("Buldhana");
		publisherList.add("Maharashatra");
		publisherList.add("Vidharbha");
		publisherList.add("India");
		publisherList.add("South India");
		publisherList.add("Eash Asia");
		publisherList.add("Asian");
		publisherList.add("Europ");
		
		publisherList.remove("");
		service.shutdown();
	}

}

class MyCallable1 implements Callable<ArrayList<Character>> {
	String message;

	public MyCallable1(String message) {
		this.message = message;
	}

	@Override
	public ArrayList<Character> call() throws Exception {
		 System.out.println(Thread.currentThread().getName()+" is responsible to Find # Characters in "+message+":");
		 ArrayList<Character> msgList=new ArrayList<Character>();
		 
		 char []ch=message.toCharArray();
		 
		 for (int i = 0; i < ch.length; i++) {
			 msgList.add(ch[i]);
		}
		 
		 return msgList;
	}

}