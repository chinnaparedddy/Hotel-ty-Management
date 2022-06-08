package com.tys.hotel.service;

import com.tys.hotel.dao.CustomerDao;
import com.tys.hotel.dto.Customer;

public class CustomerService {

	CustomerDao customerDao=new CustomerDao();
	public Customer saveCustomers(Customer customer) {
		return customerDao.saveCustomer(customer);
	}
	public int validCustomer(String email,long phone) {
		return customerDao.validateCustomer(email, phone);
	}
}
