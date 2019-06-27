package com.forescout.app;

/**
 * class PhoneNumbers contain the customer PhoneNumbers Type type; double
 * number;
 *
 */
public class PhoneNumbers {

	private Type type;
	private String number;

	/*
	 * enum Type: the type of the PhoneNumbers can be phone or mobile
	 *
	 */
	enum Type {
		mobile, phone
	}

	public PhoneNumbers(Type type, String number) {
		this.type = type;
		this.number = number;

	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

//  "phoneNumbers": [
//
//      {
//
//          "type": "mobile",
//
//          "number": +972- 548717894
//
//"
//
//      }

}
