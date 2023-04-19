package com.savarino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savarino.entities.Customer;
import com.savarino.repo.CustomerDAO;
@Service
public class CustomerServiceImpl implements CustomerService  {
	
	@Autowired
	CustomerDAO dao;
	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void addCustomer(Customer c) {
		// TODO Auto-generated method stub
		 dao.save(c);
	}

}
