/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpa.entities;

import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

/**
 *
 * @author Jordan
 */
@Embeddable
public class Address {

	@Size(max = 50)
	private String sity;
	@Size(max = 50)
	private String street;

	public Address() {
	}

	public Address(String sity, String street) {
		this.sity = sity;
		this.street = street;
	}

	public String getSity() {
		return sity;
	}

	public void setSity(String sity) {
		this.sity = sity;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
}
