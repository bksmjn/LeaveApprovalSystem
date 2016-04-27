package mum.edu.leavemgmtsys.domain;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


/**
 *@author bikesh
**/
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String addressId;

	@ManyToOne
	@Column(name="userid")
	private String userId;
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
		
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
