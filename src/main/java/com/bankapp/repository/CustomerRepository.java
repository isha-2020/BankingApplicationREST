package com.bankapp.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bankapp.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	
	public List<Customer>searchByCustName(String custName);
	

}
