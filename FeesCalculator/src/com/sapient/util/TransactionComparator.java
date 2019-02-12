package com.sapient.util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.sapient.beans.Transaction;

public class TransactionComparator implements Comparator<Transaction> {

	private List<Comparator<Transaction>> listComparators;
	 
    @SafeVarargs
    public TransactionComparator(Comparator<Transaction>... comparators) {
        this.listComparators = Arrays.asList(comparators);
    }
 
    @Override
    public int compare(Transaction t1, Transaction t2) {
        for (Comparator<Transaction> comparator : listComparators) {
            int result = comparator.compare(t1, t2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
}
