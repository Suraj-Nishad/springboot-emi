/**
 * 
 */
package com.finance.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finance.springapp.dao.CustomerRegisterDao;
import com.finance.springapp.entities.CustomerRegistration;

/**
 * @author lntinfotech/Ashika Jinturkar
 *
 */

@Service
@Transactional
public class CustomerRegisterServiceImpl implements CustomerRegisterService{
	
	@Autowired
	CustomerRegisterDao customerRegisterDao;

	@Override
	public CustomerRegistration createCustomer(CustomerRegistration customerRegistration) {
		
		return customerRegisterDao.createCustomer(customerRegistration);
	}

	@Override
	public CustomerRegistration updateCustomer(CustomerRegistration customerRegistration) {
		
		return customerRegisterDao.updateCustomer(customerRegistration);
	}

	@Override
	public CustomerRegistration findCustomerById(int customerId) {
		
		return customerRegisterDao.findCustomerById(customerId);
	}

	@Override
	public List<CustomerRegistration> getallCustomers() {
	
		return customerRegisterDao.getallCustomers();
	}

	@Override
	public void deleteCustomerRegistration(Integer customerId) {
		customerRegisterDao.deleteCustomerRegistration(customerId);
	}

	@Override
	public CustomerRegistration findUserByUserName(String username) {
	
		return customerRegisterDao.findUserByUserName(username);
	}

	@Override
	public CustomerRegistration findUserEmail(String email) {
		
		return customerRegisterDao.findUserEmail(email);
	}

}
