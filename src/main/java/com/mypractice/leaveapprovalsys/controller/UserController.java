package mum.edu.leaveapprovalsys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mum.edu.leaveapprovalsys.domain.User;
import mum.edu.leaveapprovalsys.service.UserService;
import mum.edu.leaveapprovalsys.validation.UserValidator;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserValidator userValidator;
	@Autowired
	UserService userService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<User> findAll() {
		return this.userService.getAllUser();
	}

	@RequestMapping(method = RequestMethod.GET)
	public String getUser() {
		return "users";
	}

	@RequestMapping(method = RequestMethod.POST)
	public void addUser(User user) {
		if (this.userValidator.validateUser(user)) {
			System.out.println("Inside addUser");
			this.userService.addUser(user);
		}
	}

	@RequestMapping(value = "/{userid}", method = RequestMethod.GET)
	public @ResponseBody User getUser(@PathVariable String userid) {
		return this.userService.getUserByEmailAddress(userid);
	}

}
