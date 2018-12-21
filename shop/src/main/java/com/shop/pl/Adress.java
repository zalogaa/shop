package com.shop.pl;

public class Adress {
	
	private Long id = null;
	String city;
	String street;
	String country;
	String zipCode;
	String phoneNumber;
	Customer customer;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Adress(Long id, String city, String street, String country, String zipCode, String phoneNumber,
			Customer customer) {
		super();
		this.id = id;
		this.city = city;
		this.street = street;
		this.country = country;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.customer = customer;
	}
	
	
	
	
}