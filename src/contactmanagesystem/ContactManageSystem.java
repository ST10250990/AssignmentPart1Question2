/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contactmanagesystem;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class ContactManageSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();

        while (true) {//to loop the menu whenever the user is finish with adding, to show the list of contacts or to exit
            System.out.println("\nContact Management System");
            System.out.println("1. Add Personal Contact");
            System.out.println("2. Add Business Contact");
            System.out.println("3. List of Contacts");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:// to add personal contact number
                    System.out.print("First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Birthdate: ");
                    String birthdate = scanner.nextLine();

                    PersonalContact personalContact = new PersonalContact(firstName, lastName, phoneNumber, email, birthdate);//instatiate
                    contactManager.addContact(personalContact);
                    break;
                case 2://to add business contact number
                    System.out.print("First Name: ");
                    String busFirstName = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String busLastName = scanner.nextLine();
                    System.out.print("Phone Number: ");
                    String busPhoneNumber = scanner.nextLine();
                    System.out.print("Email: ");
                    String busEmail = scanner.nextLine();
                    System.out.print("Company Name: ");
                    String companyName = scanner.nextLine();

                    BusinessContact businessContact = new BusinessContact(busFirstName, busLastName, busPhoneNumber, busEmail, companyName);//instatiate
                    contactManager.addContact(businessContact);
                    break;
                case 3://to list the contacts that have been added
                    contactManager.listContacts();
                    System.out.print("Enter the index of the contact you want to view (0 to cancel): ");
                    int index = scanner.nextInt();
                    if (index != 0) {
                        Contact contact = contactManager.getContact(index - 1);
                        if (contact != null) {
                            System.out.println("\nContact Details:\n" + contact);
                        } else {
                            System.out.println("Invalid contact index.");
                        }
                    }
                    break;
                case 4://exit program
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default://worng choice 
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

}
