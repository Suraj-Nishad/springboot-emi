package com.finance.springapp.dao;

import java.util.List;

import com.finance.springapp.entities.AdminLogin;


public interface AdminDao {

	public List<AdminLogin> getallAdmins();
	
}
