package mum.edu.leaveapprovalsys.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.leaveapprovalsys.domain.User;
import mum.edu.leaveapprovalsys.repository.UserRepository;
import mum.edu.leaveapprovalsys.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	public UserServiceImpl(){
		System.out.println("User Service Bean Created");
	}

	public void addUser(User user) {
		System.out.println("Set Size:"+user.getAddresses().size());
		this.userRepository.save(user);

	}

	public User getUserByEmailAddress(String emailAddress) {
		return this.userRepository.findOne(emailAddress);
	}

	public List<User> getAllUser() {
		return (List<User>)this.userRepository.findAll();
	}

}
