package com.day22.collection;

/**
 * UC1:- Ability to create a Contacts in Address Book with first and last names,
 * address, city, state, zip, phone number and email...
 * 
 * @author user -Almas
 *
 */
public class AddressBook {

	private class Contact {
		String firstName, lastNmae, address, city, state, emailId;
		int zipCode;
		long mobileNumber;
	}

	/**
	 * created method printContact for creating contacts in AddressBook
	 */
	public void printContact() {
		Contact person = new Contact();
		person.firstName = "Almas";
		person.lastNmae = "Banu";
		person.address = "Gandhinagar";
		person.city = "Davanagere";
		person.state = "Karnataka";
		person.zipCode = 577601;
		person.mobileNumber = 9090909090L;
		person.emailId = "almasbanu20111998@gmail.com";
		System.out.println("Contact Details");
		System.out.println("Name          : " + person.firstName + " " + person.lastNmae + "\n" + "Address       : "
				+ person.address + "\n" + "City          : " + person.city + "\n" + "State         : " + person.state
				+ "\n" + "ZipCode       : " + person.zipCode + "\n" + "MobileNumber  : " + person.mobileNumber + "\n"
				+ "EmailId       : " + person.emailId + "\n");
	}

	/**
	 * Main method for manipulation Of Collections
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {
		/**
		 * created instance of AddressBook class
		 */
		AddressBook addressBook = new AddressBook();
		/**
		 * Calling method printContact for displaying contacts
		 */
		addressBook.printContact();

	}

}
