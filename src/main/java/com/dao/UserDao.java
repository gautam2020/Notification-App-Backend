package com.dao;

import com.models.Login;
import com.models.User;

public interface UserDao {
	void register(User user);

	User validateUser(Login login);
}