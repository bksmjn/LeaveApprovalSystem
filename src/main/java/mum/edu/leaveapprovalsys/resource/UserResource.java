package mum.edu.leaveapprovalsys.resource;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import mum.edu.leaveapprovalsys.domain.Address;
import mum.edu.leaveapprovalsys.domain.Role;

public class UserResource extends ResourceSupport{

	private String firstName;
	private String middleName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String emailAddress;
	private String phoneNumber;
	private String mobileNumber;
	private Role role;
	private List<Address> addresses;
	
	
	public UserResource(){
		this.addresses=new ArrayList<Address>();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	

	
	
	
}
