package com.forescout.app;

/**
 * class Address contain the customer address String streetAddress; String city;
 * int postalCode;
 *
 */
public class Address {

	private String streetAddress;
	private String city;
	private int postalCode;

	public Address(String streetAddress, String city, int postalCode) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.postalCode = postalCode;

	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	
	
	
//  "address": {
//
//      "streetAddress": " ",
//
//     "city": " tel aviv ",
//
//      "postalCode": 10021
//
//  },

}
