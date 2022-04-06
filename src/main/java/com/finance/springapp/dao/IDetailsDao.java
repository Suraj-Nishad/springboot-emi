package com.finance.springapp.dao;

import java.util.List;

import com.finance.springapp.entities.User;

public interface IDetailsDao {

    User findUserById(int id);

    User createUser(User user);

    User createUser(String username);

    List<User> allUsers();

	void deleteUser(Integer id);

	User updateUser(Integer id,String name);
}
