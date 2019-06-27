package com.forescout.app;

/**
 * class Customer contain the customer data String firstName; String lastName;
 * double age; Address address; PhoneNumbers phoneNumbers;
 *
 */
public class Customer {



	private String firstName;
	private String lastName;
	private double age;
	private Address address;
	private PhoneNumbers phoneNumbers;

	public Customer(String firstName, String lastName, double age, Address address, PhoneNumbers phoneNumbers) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.phoneNumbers = phoneNumbers;
	}
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public PhoneNumbers getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(PhoneNumbers phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	

//    "firstName": " Michael",
//
//    "lastName": " Msheal ",
//
//    "age": 27,
//
//    "address": {
//
//        "streetAddress": " ",
//
//       "city": " tel aviv ",
//
//        "postalCode": 10021
//
//    },
//
//    "phoneNumbers": [
//
//        {
//
//            "type": "mobile",
//
//            "number": +972- 548717894
//
//"
//
//        }

}
