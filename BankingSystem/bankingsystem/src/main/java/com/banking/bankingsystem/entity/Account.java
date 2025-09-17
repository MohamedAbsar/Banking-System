package com.banking.bankingsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "account")
public class Account {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "account_number", unique = true)
	private String accountNumber;

	@Column(name = "account_type")
	private String accountType;

	@Column(name = "balance")
	private double balance;

	// Default Constructor
	public Account() {
	}

	// Parameterized constructor
	public Account(String name, String accountNumber, String accountType, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
	}

	// Getters and setters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
