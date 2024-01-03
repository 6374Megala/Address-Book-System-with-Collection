package com.addressbook.collection;

import java.util.Scanner;

public class AddressBookMain {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            AddressBook addressBook = new AddressBook("MyAddressBook");

            Contact contact1 = new Contact("Megala", "R", "123 ooty", "Bangalore", "Karnataka", "12345", "123-456-7890", "mega@gmail.com");
            Contact contact2 = new Contact("Sanjana", "J", "456 ketti", "Coonoor", "Tamilnadu", "67890", "987-654-3210", "sanjana@gmail.com");
            Contact contact3 = new Contact("Megala", "R", "123 ooty", "Bangalore", "Karnataka", "12345", "123-456-7890", "mega@gmail.com");
            addressBook.addContact(contact1);
            addressBook.addContact(contact2);
            addressBook.addContact(contact3);

        
            Contact newContact = new Contact("Sanjana", "J", "789 Elm St", "Coonoor", "Tamilnadu", "54321", "111-222-3333", "sanju.new@.com");
            addressBook.editContact("Megala", "R", newContact);

        
            addressBook.deleteContact("Megala", "R");

            System.out.println("Contacts in City1: " + addressBook.searchByCity("Bangalore"));
            System.out.println("Contacts in State2: " + addressBook.searchByState("Karnataka"));
            System.out.println("Count of contacts in City1: " + addressBook.countByCity("Coonoor"));
            System.out.println("Count of contacts in State2: " + addressBook.countByState("Karnataka"));
        }
}
