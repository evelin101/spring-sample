package com.absolutns.service;

import java.util.List;

import com.absolutns.model.Customer;
import com.absolutns.repository.CustomerRepository;
import com.absolutns.repository.HibernateCustomerRespositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerRespositoryImpl();
		
	/* (non-Javadoc)
	 * @see com.absolutns.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
	return customerRepository.findAll();	
	}
	}

