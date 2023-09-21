/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactmanagesystem;

/**
 *
 * @author lab_services_student
 */
public class PersonalContact extends Contact{//sub class of contact
    private String birthdate;

    public PersonalContact(String firstName, String lastName, String phoneNumber, String email, String birthdate) {
        super(firstName, lastName, phoneNumber, email);
        this.birthdate = birthdate;
    }

    public String getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBirthdate: " + birthdate;
    }
    
}
