package com.sapient.util;

import java.util.Comparator;

import com.sapient.beans.Transaction;

public class ClientIdComparator implements Comparator<Transaction>{

	@Override
	public int compare(Transaction o1, Transaction o2) {
		 
		return o1.getClientId().compareTo(o2.getClientId());
	}

}
