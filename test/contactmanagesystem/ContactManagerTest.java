/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package contactmanagesystem;

import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class ContactManagerTest {
    
    public ContactManagerTest() {
    }

    @Test
    public void testAddContact() {
       ContactManager contactM= new ContactManager();
       
       
       
       Contact contact1 = new Contact("Tristan","Gerber","0987654321","Tristan.gmail.com");
       contactM.addContact(contact1);
      
       assertEquals(1,contactM.listContacts());
    }
    
    @Test
    public void testListContacts() {
        ContactManager contactM = new ContactManager();
        Contact contact1 = new Contact("John", "Doe", "1234567890", "john.doe.gmail.com");
        Contact contact2 = new Contact("Alice", "Smith", "9876543210", "alice.smith.gmail.com");

        contactM.addContact(contact1);
        contactM.addContact(contact2);

        String expected = "Contacts:\n" +
                                "1. John Doe\n" +
                                "2. Alice Smith\n";

        assertEquals(expected, contactM.listContacts());
    }
    
    @Test
    public void testGetContact() {
        ContactManager contactM = new ContactManager();
        Contact contact1 = new Contact("John", "Doe", "1234567890", "john.doe.gmail.com");
        Contact contact2 = new Contact("Alice", "Smith", "987-654-3210", "alice.smith.gmail.com");

        contactM.addContact(contact1);
        contactM.addContact(contact2);

        assertEquals(contact1, contactM.getContact(0));
        assertEquals(contact2, contactM.getContact(1));
        assertNull(contactM.getContact(2));
    }

    
    
}
