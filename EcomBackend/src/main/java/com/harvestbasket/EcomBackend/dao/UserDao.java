package com.harvestbasket.EcomBackend.dao;

import java.util.List;

import com.harvetbasket.EcomBackend.model.User;

public interface UserDao {
	
	boolean insertUser(User user);
	boolean updateUser(User user);
	boolean deleteUser(User user);
	List<User> selectAllUser();
	User selectOneUser();
}
