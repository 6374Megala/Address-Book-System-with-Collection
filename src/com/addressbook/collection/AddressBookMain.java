package com.addressbook.collection;

import java.util.Scanner;

public class AddressBookMain {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            AddressBook addressBook = new AddressBook("MyAddressBook");

            Contact contact1 = new Contact("John", "Doe", "123 Main St", "City1", "State1", "12345", "123-456-7890", "john@example.com");
            Contact contact2 = new Contact("Jane", "Doe", "456 Oak St", "City2", "State2", "67890", "987-654-3210", "jane@example.com");
            Contact contact3 = new Contact("John", "Doe", "123 Main St", "City1", "State1", "12345", "123-456-7890", "john@example.com");
            addressBook.addContact(contact1);
            addressBook.addContact(contact2);
            addressBook.addContact(contact3);

            // Edit contact
            Contact newContact = new Contact("John", "Doe", "789 Elm St", "City1", "State1", "54321", "111-222-3333", "john.new@example.com");
            addressBook.editContact("John", "Doe", newContact);

            // Delete contact
            addressBook.deleteContact("Jane", "Doe");

            // Search and count
            System.out.println("Contacts in City1: " + addressBook.searchByCity("City1"));
            System.out.println("Contacts in State2: " + addressBook.searchByState("State2"));
            System.out.println("Count of contacts in City1: " + addressBook.countByCity("City1"));
            System.out.println("Count of contacts in State2: " + addressBook.countByState("State2"));
        }
}
