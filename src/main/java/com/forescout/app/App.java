package com.forescout.app;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

import com.forescout.app.PhoneNumbers.Type;

/**
 * class App build object from type Customer and then convert it to json string
 * that will be logged to C:\\Folder\\jsontest.txt file
 *
 */
public class App {
	public static void main(String[] args) {

		try {

			String firstName = "Michael";
			String lastName = "Msheal";
			int age = 23;
			String streetAddress = "Alberka";
			String city = "Shfar-am";
			int postalCode = 202000;
			Type type = Type.mobile;
			String number = "0548717894";

			// build an object of Customer that contain the data
			Address address = new Address(streetAddress, city, postalCode);
			PhoneNumbers phoneNumbers = new PhoneNumbers(type, number);
			Customer customer = new Customer(firstName, lastName, age, address, phoneNumbers);

			ObjectMapper mapper = new ObjectMapper();

			// define and config logger that will log to C:\\Folder\\jsontest.txt file
			final Logger logger = Logger.getLogger(App.class);

			// Object to JSON in String
			String jsonInString = mapper.writeValueAsString(customer);

			// logs a debug message
			if (logger.isDebugEnabled()) {
				logger.debug(jsonInString);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
