package com.tys.hotel.service;

import com.tys.hotel.dao.EmployeeDao;
import com.tys.hotel.dto.Employee;

public class EmployeService {

	EmployeeDao employeeDao=new EmployeeDao();
	 public Employee saveEmployee(Employee employee) {
		 
	return employeeDao.saveEmployee(employee);	 
	 
	 }
	 public int validateEmployee(String email, long phone) {
		 return employeeDao.ValidateEmployee(email, phone);
	 }
}

