package com.shop.pl.application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String surname;
	private String email;
	private String password;
	private Boolean isActive;
	private String activeKey;

	public User() {

	}
}
