package com.bankapp.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="LOGGER")
public class Logger {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int acctID;
	
	private String transacType;
	
	private String transacStatus;
	
	private  int initBalance;
	
	private int finalBal;
	
	
	public Logger(){

	}

public Logger(int acctID, String transacType, String transacStatus, int initBalance, int finalBal) {
		super();
		this.acctID = acctID;
		this.transacType = transacType;
		this.transacStatus = transacStatus;
		this.initBalance = initBalance;
		this.finalBal = finalBal;
    }

  public int getAcctID() {
		return acctID;
	}

public void setAcctID(int acctID) {
		this.acctID = acctID;
	}

public String getTransacType() {
		return transacType;
	}
public void setTransacType(String transacType) {
		this.transacType = transacType;
	}

public String getTransacStatus() {
		return transacStatus;
	}
public void setTransacStatus(String transacStatus) {
		this.transacStatus = transacStatus;
	}

	public int getInitBalance() {
		return initBalance;
	}

  public void setInitBalance(int initBalance) {
		this.initBalance = initBalance;
	}

 public int getFinalBal() {
		return finalBal;
	}

public void setFinalBal(int finalBal) {
		this.finalBal = finalBal;
	}
}









	