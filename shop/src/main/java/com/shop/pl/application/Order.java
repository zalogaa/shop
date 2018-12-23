package com.shop.pl.application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Order {
	@Id
	@GeneratedValue
	private Long id;
	private boolean isPaid;
}
