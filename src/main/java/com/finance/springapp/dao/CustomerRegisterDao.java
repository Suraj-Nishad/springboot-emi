/**
 * 
 */
package com.finance.springapp.dao;

import java.util.List;

import com.finance.springapp.entities.CustomerRegistration;

/**
 * @author lntinfotech/Ashika Jinturkar
 *
 */
public interface CustomerRegisterDao {

	public CustomerRegistration createCustomer(CustomerRegistration customerRegistration);

	public CustomerRegistration updateCustomer(CustomerRegistration customerRegistration);

	public CustomerRegistration findCustomerById(int customerId);
	
	public List<CustomerRegistration> getallCustomers();
	
	public void deleteCustomerRegistration(Integer customerId);
	
	CustomerRegistration findUserByUserName(String username);
	
	public CustomerRegistration findUserEmail(String email);
}
