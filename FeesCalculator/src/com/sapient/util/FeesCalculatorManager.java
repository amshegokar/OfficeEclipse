package com.sapient.util;

import java.util.List;

import com.sapient.beans.Transaction;

public interface FeesCalculatorManager{

	
	List<Transaction> populateData(String fileName);
	double calculateProcessingFee(List<Transaction> transactions );
	
	//Transaction findIntraDayTransactionsByTransactionId(List<Transaction> transactions,Transaction transaction);
	
	void sortTransactionComparator(List<Transaction> transactions);
	
}
