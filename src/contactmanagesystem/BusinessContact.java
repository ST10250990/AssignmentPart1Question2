/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactmanagesystem;

/**
 *
 * @author lab_services_student
 */
public class BusinessContact extends Contact{//sub class for the business side of the contact
    private String companyName;

    public BusinessContact(String firstName, String lastName, String phoneNumber, String email, String companyName) {
        super(firstName, lastName, phoneNumber, email);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
    
     @Override
    public String toString() {
        return super.toString() + "\nCompany Name: " + companyName;
    }
}
