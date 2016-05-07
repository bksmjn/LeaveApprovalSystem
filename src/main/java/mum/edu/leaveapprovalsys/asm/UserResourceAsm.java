package mum.edu.leaveapprovalsys.asm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import mum.edu.leaveapprovalsys.domain.Address;
import mum.edu.leaveapprovalsys.domain.User;
import mum.edu.leaveapprovalsys.resource.UserResource;

public class UserResourceAsm extends ResourceAssemblerSupport<User, UserResource> {
	
	public UserResourceAsm(){
		super(User.class, UserResource.class);
	}

	@Override
	public UserResource toResource(User user) {
		UserResource userResource=new UserResource();
		userResource.setFirstName(user.getFirstName());
		userResource.setMiddleName(user.getMiddleName());
		userResource.setLastName(user.getLastName());
		userResource.setDateOfBirth(user.getDateOfBirth());
		userResource.setPhoneNumber(user.getPhoneNumber());
		userResource.setMobileNumber(user.getMobileNumber());
		userResource.setRole(user.getRole());
		List<Address> a=new ArrayList<Address>();
		a.addAll(user.getAddresses());
		userResource.setAddresses(a);
		return userResource;
	}
	
	

}
