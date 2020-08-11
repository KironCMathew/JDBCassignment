package com.bean;

public class Loan extends Account {

	private String loanId;
	private String loanType;
	private double loanAmount;
	
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Loan(String loanId, String loanType, double loanAmount) {
		super();
		this.loanId = loanId;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
	}

	public String getLoanId() {
		return loanId;
	}
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", loanType=" + loanType + ", loanAmount=" + loanAmount + "]";
	}
	
	
	
	
	
	
	
	
}
