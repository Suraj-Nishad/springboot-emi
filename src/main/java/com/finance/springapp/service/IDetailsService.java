package com.finance.springapp.service;


import java.util.List;

import com.finance.springapp.entities.User;

public interface IDetailsService {

    User findUserById(int id);

    User createUser(User user);

    User createUser(String name);

    List<User> allUsers();

	void deleteUser(Integer id);

	User updateUser(Integer id, String name);
}
