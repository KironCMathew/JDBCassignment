package com.bean;

public class Account {

	private String accountId;
	private String accountName;
	private String address;
	private double depositAmount;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String accountId, String accountName, String address, double depositAmount) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.address = address;
		this.depositAmount = depositAmount;
	}

	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountName=" + accountName + ", address=" + address
				+ ", depositAmount=" + depositAmount + "]";
	}



}

