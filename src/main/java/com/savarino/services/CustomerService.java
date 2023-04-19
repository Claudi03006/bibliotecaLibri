package com.savarino.services;

import java.util.List;


import com.savarino.entities.Customer;

public interface CustomerService {
	List<Customer>getCustomer();
	void addCustomer (Customer c);

}
