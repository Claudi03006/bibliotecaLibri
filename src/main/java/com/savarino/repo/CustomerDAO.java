package com.savarino.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.savarino.entities.Customer;


public interface CustomerDAO extends JpaRepository<Customer, Integer>{

}
