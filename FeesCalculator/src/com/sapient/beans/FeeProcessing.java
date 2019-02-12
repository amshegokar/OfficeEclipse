package com.sapient.beans;

import java.util.Date;

public class FeeProcessing {

	private String clientId;
	private TransactionType transactionType;
	private Date tTransactionDate;
	private Priority priorityFlag;
	private double processingFees;

	public FeeProcessing() {
		// TODO Auto-generated constructor stub
	}

	public FeeProcessing(String clientId, TransactionType transactionType, Date tTransactionDate, Priority priorityFlag,
			double processingFees) {
		super();
		this.clientId = clientId;
		this.transactionType = transactionType;
		this.tTransactionDate = tTransactionDate;
		this.priorityFlag = priorityFlag;
		this.processingFees = processingFees;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public Date gettTransactionDate() {
		return tTransactionDate;
	}

	public void settTransactionDate(Date tTransactionDate) {
		this.tTransactionDate = tTransactionDate;
	}

	public Priority getPriorityFlag() {
		return priorityFlag;
	}

	public void setPriorityFlag(Priority priorityFlag) {
		this.priorityFlag = priorityFlag;
	}

	public double getProcessingFees() {
		return processingFees;
	}

	public void setProcessingFees(double processingFees) {
		this.processingFees = processingFees;
	}

	@Override
	public String toString() {
		return "FeeProcessing [clientId=" + clientId + ", transactionType=" + transactionType + ", tTransactionDate="
				+ tTransactionDate + ", priorityFlag=" + priorityFlag + ", processingFees=" + processingFees + "]";
	}

}
