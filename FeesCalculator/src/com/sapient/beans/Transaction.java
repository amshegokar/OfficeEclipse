package com.sapient.beans;

import java.util.Date;

public class Transaction {

	private String transactionId;
	private String clientId;
	private String securityId;
	private TransactionType transactionType;
	private Date tTransactionDate;
	private double marketValue;
	private Priority priorityFlag;
	
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	
	public Transaction(String transactionId, String clientId, String securityId, TransactionType transactionType,
			Date tTransactionDate, double marketValue, Priority priorityFlag) {
		super();
		this.transactionId = transactionId;
		this.clientId = clientId;
		this.securityId = securityId;
		this.transactionType = transactionType;
		this.tTransactionDate = tTransactionDate;
		this.marketValue = marketValue;
		this.priorityFlag = priorityFlag;
	}
	
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getSecurityId() {
		return securityId;
	}
	public void setSecurityId(String securityId) {
		this.securityId = securityId;
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
	public double getMarketValue() {
		return marketValue;
	}
	public void setMarketValue(double marketValue) {
		this.marketValue = marketValue;
	}
	public Priority getPriorityFlag() {
		return priorityFlag;
	}
	public void setPriorityFlag(Priority priorityFlag) {
		this.priorityFlag = priorityFlag;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", clientId=" + clientId + ", securityId=" + securityId
				+ ", transactionType=" + transactionType + ", tTransactionDate=" + tTransactionDate + ", marketValue="
				+ marketValue + ", priorityFlag=" + priorityFlag + "]";
	}
	
	
	
}
