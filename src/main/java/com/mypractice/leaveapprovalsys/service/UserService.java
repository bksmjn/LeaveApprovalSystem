package mum.edu.leaveapprovalsys.service;

import java.util.List;

import mum.edu.leaveapprovalsys.domain.User;

public interface UserService {

	
	void addUser(User user);
	User getUserByEmailAddress(String emailAddress);
	List<User> getAllUser();
}
