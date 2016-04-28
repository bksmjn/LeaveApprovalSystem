package mum.edu.leaveapprovalsys;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mum.edu.leaveapprovalsys.domain.Address;
import mum.edu.leaveapprovalsys.domain.Role;
import mum.edu.leaveapprovalsys.domain.User;
import mum.edu.leaveapprovalsys.service.UserService;

@Component
public class StartupBean {

	@Autowired
	private UserService userService;

	@PostConstruct
	private void init() {
		User user = new User();
		Address address = new Address();
		address.setAddressType("PERM");
		address.setCity("Irving");
		address.setState("TX");
		address.setStreet("1000 North 4th Street");
		address.setZipCode("52557");
		user.setEmailAddress("bksmjn@gmail.com");
		user.setActive(true);
		user.setFirstName("Bikesh");
		user.setMiddleName("");
		user.setLastName("Maharjan");
		user.setMobileNumber("319-217-7861");
		user.setPhoneNumber("319-217-7861");
		user.setRole(Role.ADMIN);
		address.setUser(user);
		Set<Address> addresses = new HashSet<Address>();
		addresses.add(address);
		user.setAddresses(addresses);
		this.userService.addUser(user);
	}

}
