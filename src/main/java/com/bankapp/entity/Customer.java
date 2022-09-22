package com.bankapp.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Customer_ID")
	private int customerID;
	
	final String bankName="State Bank of India";
	
	
	@NotBlank(message = "custName is mandatory")
	private String custName;
	
	@Column(unique=true)
	@Email(message ="Email should be valid")
	@NotNull
      private String custEmail;
	
	@NotBlank(message = "City is mandatory")
	private String city;
	
	@NotBlank(message = "State is mandatory")
	private String state;
	
	
	@NotBlank(message = "country is mandatory")
	private String country;
	
	@Column(unique=true)
	@Size( min=10,max = 10, message = "phoneNo name should have at least 10 characters")
	private String phoneNo;
	
	
	public Customer() {

	}
	 public Customer(int customerID, @NotBlank(message = "custName is mandatory") String custName,
			@Email String custEmail, @NotBlank(message = "City is mandatory") String city,
			@NotBlank(message = "State is mandatory") String state,
			@NotBlank(message = "country is mandatory") String country,
			@NotEmpty @Size(max = 10, message = "phoneNo name should have at least 10 characters") String phoneNo) {
		super();
		this.customerID = customerID;
		this.custName = custName;
		this.custEmail = custEmail;
		this.city = city;
		this.state = state;
		this.country = country;
		this.phoneNo = phoneNo;
	}

  public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

public String getBankName() {
		return bankName;
	}


public String getCustEmail() {
	return custEmail;
}

public void setCustEmail(String custEmail) {
	this.custEmail = custEmail;
}

public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}


}
