package com.absolutns.repository;

import java.util.ArrayList;
import java.util.List;

import com.absolutns.model.Customer;

public class HibernateCustomerRespositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.absolutns.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstname("Evelin");
		customer.setLastname("Dicheva");

		customers.add(customer);
		return customers;

	}
}