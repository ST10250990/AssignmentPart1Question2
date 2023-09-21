/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactmanagesystem;

/**
 *
 * @author lab_services_student
 */
public class Contact {
    //declaring private variables
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
   //getters and setters
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String firstName, String lastName, String phoneNumber, String email) {//constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        
        
    }
    @Override
        public String toString() {
        return "Name: " + firstName + " " + lastName +
               "\nPhone Number: " + phoneNumber +
               "\nEmail: " + email;
    }

   
    
    
}
