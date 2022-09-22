package com.bankapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bankapp.entity.Customer;
import com.bankapp.service.CustomerService;


@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@Autowired
	private AccountController accountController;
	
	@PostMapping("/createcustomer")
	public Customer createCustomer(@RequestBody Customer customer) {
		customerService.createCustomer(customer);
		accountController.createAccount(customer.getCustomerID(), 0, "Active", customer);
		return customer; 
		
	}
	
	
	 @GetMapping("/getCustomerList")
	   public List<Customer>getcustomerlist(Customer customer) {
			return customerService.getCustomerList(customer);
		   
	   }
	
   @GetMapping("/findcustomerbyid/{acctID}")
	public Customer getCustomerInfo(@PathVariable int acctID) {
		return customerService.getCustomerInfo(acctID);
	}
   
   @GetMapping("/findcustomerbyname/{custName}")
	public List<Customer>searchCustomer(@PathVariable String custName) {
		return customerService.searchbyCustName(custName);
	   
   }
  
  

	}
