package com.process.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class ProcessDetails {
	@Id
	private String adhaarNumber;
	private String name;
	private String dateOfBirth;
	private String pan;
	private double salary;
	private double allowance;
	private String pensionType;
	private double pensionAmount;
	private long accountNumber;
	private String bankType;
	private Double bankServiceCharge;

	private Double totalAmount;

	public ProcessDetails(String adhaarNumber, String name, String dateOfBirth, String pan, double salary,
			double allowance, String pensionType, double pensionAmount, long accountNumber, String bankType,
			Double bankServiceCharge, Double totalAmount) {
		super();
		this.adhaarNumber = adhaarNumber;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.pan = pan;
		this.salary = salary;
		this.allowance = allowance;
		this.pensionType = pensionType;
		this.pensionAmount = pensionAmount;
		this.accountNumber = accountNumber;
		this.bankType = bankType;
		this.bankServiceCharge = bankServiceCharge;
		this.totalAmount = totalAmount;
	}
	

	public ProcessDetails() {
		super();
	}


	public String getAdhaarNumber() {
		return adhaarNumber;
	}

	public void setAdhaarNumber(String adhaarNumber) {
		this.adhaarNumber = adhaarNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public String getPensionType() {
		return pensionType;
	}

	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}

	public double getPensionAmount() {
		return pensionAmount;
	}

	public void setPensionAmount(double pensionAmount) {
		this.pensionAmount = pensionAmount;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public Double getBankServiceCharge() {
		return bankServiceCharge;
	}

	public void setBankServiceCharge(Double bankServiceCharge) {
		this.bankServiceCharge = bankServiceCharge;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
}
	
	
	
	