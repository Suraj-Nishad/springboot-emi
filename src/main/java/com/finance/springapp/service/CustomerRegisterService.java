/**
 * 
 */
package com.finance.springapp.service;

import java.util.List;

import com.finance.springapp.entities.CustomerRegistration;
import com.finance.springapp.entities.User;

/**
 * @author lntinfotech/Ashika Jinturkar
 *
 */
public interface CustomerRegisterService {
	
	public CustomerRegistration createCustomer(CustomerRegistration customerRegistration);
	
	public CustomerRegistration updateCustomer(CustomerRegistration customerRegistration);
	
	public CustomerRegistration  findCustomerById(int customerId); 
	
	public List<CustomerRegistration> getallCustomers();
	
	public void deleteCustomerRegistration(Integer customerId);
	
	CustomerRegistration findUserByUserName(String username);
	
	public CustomerRegistration findUserEmail(String email);
	
}
