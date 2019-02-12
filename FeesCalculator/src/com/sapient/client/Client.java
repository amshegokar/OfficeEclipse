package com.sapient.client;

import java.util.List;

import com.sapient.beans.Transaction;
import com.sapient.util.FeesCalculatorManager;
import com.sapient.util.FeesCalculatorManagerImple;

public class Client {

	public static void main(String[] args) {

		FeesCalculatorManager mgr = new FeesCalculatorManagerImple();
		List<Transaction> transactions = mgr.populateData("transactionDetails.csv");

		System.out.println("Listing All the Transaction: ");
		for (Transaction transaction : transactions) {
			System.out.println(transaction);
		}
		
		
		//mgr.calculateProcessingFee(transactions);
		//mgr.findIntraDayTransactions(transactions);
		
		
		System.out.println("Sorting By Client ID");
		mgr.sortTransactionComparator(transactions);

	}
}
