package com.addressbook.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBook {
    private String name;
    private List<Contact> contacts;

    public AddressBook(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            System.out.println("Contact added successfully.");
        } else {
            System.out.println("Contact already exists. Duplicate entry not allowed.");
        }
    }

    public void editContact(String firstName, String lastName, Contact newContact) {
        contacts.removeIf(contact -> contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName));
        contacts.add(newContact);
        System.out.println("Contact edited successfully.");
    }

    public void deleteContact(String firstName, String lastName) {
        contacts.removeIf(contact -> contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName));
        System.out.println("Contact deleted successfully.");
    }

    public List<Contact> searchByCity(String city) {
        return contacts.stream()
                .filter(contact -> contact.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    public List<Contact> searchByState(String state) {
        return contacts.stream()
                .filter(contact -> contact.getState().equalsIgnoreCase(state))
                .collect(Collectors.toList());
    }

    public long countByCity(String city) {
        return contacts.stream()
                .filter(contact -> contact.getCity().equalsIgnoreCase(city))
                .count();
    }

    public long countByState(String state) {
        return contacts.stream()
                .filter(contact -> contact.getState().equalsIgnoreCase(state))
                .count();
    }
}
