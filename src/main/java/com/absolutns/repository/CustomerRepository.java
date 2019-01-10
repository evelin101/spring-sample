package com.absolutns.repository;

import java.util.List;

import com.absolutns.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}