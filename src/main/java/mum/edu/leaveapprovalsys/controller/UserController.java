package mum.edu.leaveapprovalsys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.leaveapprovalsys.domain.User;
import mum.edu.leaveapprovalsys.service.UserService;
import mum.edu.leaveapprovalsys.validator.UserValidator;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserValidator userValidator;
	@Autowired
	UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public List<User> findAll() {
		return this.userService.getAllUser();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void addUser(User user) {
		if (this.userValidator.validateUser(user)) {
			this.userService.addUser(user);
		}
	}
	
	@RequestMapping(value="/{userid}",method=RequestMethod.GET)
	public User getUser(@PathVariable("userid") String userid){
		return this.userService.getUserByEmailAddress(userid);
	}

}
