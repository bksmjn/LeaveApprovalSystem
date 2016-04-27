package mum.edu.leavemgmtsys.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;



/**
 * @author bikesh
 **/
@Entity
public class User  implements Serializable{

	@NotNull
	@Column(name="firstname")
	private String firstName;
	@Column(name="middlename")
	private String middleName;
	@NotNull
	@Column(name="lastname")
	private String lastName;
	@NotNull
	@Column(name="dateofbirth")
	@Temporal(TemporalType.DATE)
	private LocalDate dateOfBirth;
	@Id
	@Column(name="emailaddress")
	private String emailAddress;
	@Column(name="phonenumber")
	private String phoneNumber;
	@Column(name="mobilenumber")
	private String mobileNumber;
	@Column(name="role")
	private Role role;
	@Column(name="is_active")
	private boolean isActive;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<Address> addresses;

	public User() {
		this.addresses = new HashSet<Address>();
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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	
	

}
