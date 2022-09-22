package com.bankapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;




@Entity
public class Accounts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int acctID;
	
	
	private  int balance;
	
	
	private String acctStatus;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerID")
	private Customer customer;
	
	
	public Accounts(){

	}
	
	

	public Accounts(int acctID, int balance, String acctStatus, Customer customer) {
		super();
		this.acctID = acctID;
		this.balance = balance;
		this.acctStatus = acctStatus;
		this.customer = customer;
	}



	public int getAcctID() {
		return acctID;
	}



	public void setAcctID(int acctID) {
		this.acctID = acctID;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public String getAcctStatus() {
		return acctStatus;
	}



	public void setAcctStatus(String acctStatus) {
		this.acctStatus = acctStatus;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
	

	