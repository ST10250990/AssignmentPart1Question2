/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactmanagesystem;

import java.util.ArrayList;

/**
 *
 * @author lab_services_student
 */
public class ContactManager {
     private ArrayList<Contact> contacts;//private array list

    public ContactManager() {//constructor for the array list 
        contacts = new ArrayList<>();
    }
    
    public void addContact(Contact contact) {//to add a contact
        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }
     public int listContacts() {
        if (contacts.isEmpty()) {//checks if contact is empty or not added in
            System.out.println("No contacts found.");
        } else {
            System.out.println("Contacts:");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i).getFirstName() + " " + contacts.get(i).getLastName());//adds the contact
            }
        }
        return contacts.size();
    }
     public Contact getContact(int index) {//to get the contact
        if (index >= 0 && index < contacts.size()) {
            return contacts.get(index);
        }
        return null;
    }
    
}
