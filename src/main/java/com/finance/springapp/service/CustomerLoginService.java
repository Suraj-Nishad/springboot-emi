/**
 * 
 */
package com.finance.springapp.service;

import java.util.List;

import com.finance.springapp.entities.CustomerLogin;

/**
 * @author lntinfotech
 *
 */
public interface CustomerLoginService {
	CustomerLogin createCustomerLogin(CustomerLogin customerLogin);

	// public boolean validateUser(String username, String password);
	public List<CustomerLogin> getAllCustomerLogins();

	public CustomerLogin findCustomerLoginById(int customerLoginId);

	public CustomerLogin updateCustomerLogin(CustomerLogin customerLogin);

	public CustomerLogin findUserByUserName(String username);

	public CustomerLogin updatePassword(int CustomerLoginId, String newpassword);
}
