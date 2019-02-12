package com.psl.executorf;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkDemo {

	public static void main(String[] args) {

		PrintJob[] printJobs = { new PrintJob("Durga"), new PrintJob("Ravi"), new PrintJob("Shiva"),
				new PrintJob("Pavan"), new PrintJob("Suresh"), new PrintJob("Anil") };

		int coreCount=Runtime.getRuntime().availableProcessors();
		System.out.println("The cores of CPU are: "+coreCount);
		ExecutorService service = Executors.newFixedThreadPool(3);

		for (PrintJob printJob : printJobs) {
			//service.submit(printJob);
			service.execute(printJob);
		}
		service.shutdown();
	}

}

class PrintJob implements Runnable {
	String name;

	public PrintJob(String name) {
		this.name = name;
	}

	public void run() {

		System.out.println(name + "... Job started By Thread: " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(name + "... Job Completed By Thread: " + Thread.currentThread().getName());
	}

}