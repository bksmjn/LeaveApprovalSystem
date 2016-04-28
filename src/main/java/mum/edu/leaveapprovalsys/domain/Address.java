package mum.edu.leaveapprovalsys.domain;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


/**
 *@author bikesh
**/
@Entity
public class Address implements Serializable{
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long addressId;

	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@NotNull
	@Column(name="street")
	private String street;
	@NotNull
	@Column(name="city")
	private String city;
	@NotNull
	@Column(name="state")
	private String state;
	@NotNull
	@Column(name="zipcode")
	private String zipCode;
	@Column(name="addresstype")
	private String addressType;
	
	public Address(){
		this.user=new User();
	}


	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}







	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	
	
	
}
