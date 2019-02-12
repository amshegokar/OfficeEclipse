package com.sapient.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.sapient.beans.Priority;
import com.sapient.beans.Transaction;
import com.sapient.beans.TransactionType;

public class FeesCalculatorManagerImple implements FeesCalculatorManager {

	@Override
	public List<Transaction> populateData(String fileName) {
		
		
		// Code to determine type of file using it's extension and implment the file read code according to type of file
		
		List<Transaction> transactionList=new ArrayList<Transaction>();
		File file = new File(fileName);
		Scanner scr;
		String[] transactionData;
		try {
			scr = new Scanner(file);

			while (scr.hasNext()) {

				String data = scr.nextLine();
				transactionData = data.split(",");
				
				String transactionId=transactionData[0];
				String clientId=transactionData[1];
				String securityId=transactionData[2];
				//enum
				String transactionType=transactionData[3];
				TransactionType transactionTypeEnum=TransactionType.valueOf(transactionType.toUpperCase().trim());
				
				//date
				String tTransactionDate=transactionData[4];
				
				SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM/dd/yyyy");
				Date transactionDate=simpleDateFormat.parse(tTransactionDate);
				//marketValue
				double marketValue=Double.parseDouble(transactionData[5]);
				 //priorityFlag
				String priorityFlag=transactionData[6];
				Priority priorityFlagEnum= Priority.valueOf(priorityFlag);
				 
				Transaction transaction = new Transaction(transactionId, clientId, securityId, transactionTypeEnum, transactionDate, marketValue, priorityFlagEnum);
			 
				//System.out.println(transaction);
				 
				transactionList.add(transaction);

			}

		} catch (FileNotFoundException | ParseException e) {
			e.printStackTrace();
		}
		return transactionList;
	}

	@Override
	public double calculateProcessingFee(List<Transaction> transactions) {
		 
		return 0;
	}

	@Override
	public void sortTransactionComparator(List<Transaction> transactions) {
		 
		Collections.sort(transactions, new TransactionComparator(
	                new ClientIdComparator(),
	                new TransactionTypeComparator(),
	                new TransactionDateComparator(),
	                new TransactionPriorityComparator())
	        );
		
		System.out.println("After Sorting ");
		for (Transaction transaction : transactions) {
			System.out.println(transaction);
		}
	}

/*	@Override
	public List<Transaction> findIntraDayTransactions(List<Transaction> transactions, Transaction transaction) {
		 
		Iterator<Transaction> itr=transactions.iterator();
		while (itr.hasNext()) {
			Transaction transaction = (Transaction) itr.next();
			
			if() {
				
			}
			
		}
	
		
		return null;
	}*/

}
