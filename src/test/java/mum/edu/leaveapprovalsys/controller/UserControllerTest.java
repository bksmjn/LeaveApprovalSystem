package mum.edu.leaveapprovalsys.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import mum.edu.leaveapprovalsys.controller.UserController;
import mum.edu.leaveapprovalsys.service.UserService;
import mum.edu.leaveapprovalsys.validator.UserValidator;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

public class UserControllerTest {
	
	
	@Mock
	private UserService userService;
	
	@Mock
	private UserValidator userValidator;

	@InjectMocks
	private UserController userController;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
		mockMvc=MockMvcBuilders.standaloneSetup(userController).build();	
	}
	
	@Test
	public void test() throws Exception{
		mockMvc.perform(get("/users/all")).andDo(print());
	}

}
