/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

/**
 *
 * @author ADMIN
 */
abstract class Candidate {
    protected String candidateId, firstName, lastName, birthDate, address, phone, email;
    protected int candidateType;
    
    public Candidate(String candidateId, String firstName, String lastName, String birthDate, 
                     String address, String phone, String email, int candidateType) {
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public int getCandidateType() {
        return candidateType;
    }
    
    @Override
    public String toString() {
        return getFullName() + " | " + birthDate + " | " + address + " | " + phone + " | " + email + " | " + candidateType;
    }
}
