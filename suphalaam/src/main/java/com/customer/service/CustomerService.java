package com.customer.service;

import java.util.List;

import com.customer.model.Customer;

public interface CustomerService {
	
	 
	 Customer saveCustomer(Customer customer);
	 List<Customer> fetchCustomerList();
	
	
	
}
