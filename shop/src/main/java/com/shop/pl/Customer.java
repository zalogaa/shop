package com.shop.pl;

import java.util.ArrayList;

public class Customer {
//jebac github
	private Long id = null;
	 String name;
	 String surname;
	 Adress adress;
	 String email;
	 String password;
	 Boolean isActive;

	ArrayList<String> orders;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ArrayList<String> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<String> orders) {
		this.orders = orders;
	}

	

	public Customer(long id, String name, String surname, Adress adress, String email, String password,
			Boolean isActive, ArrayList<String> orders) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.adress = adress;
		this.email = email;
		this.password = password;
		this.isActive = isActive;
		this.orders = orders;
	}

}
