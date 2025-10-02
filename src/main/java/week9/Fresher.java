/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

/**
 *
 * @author ADMIN
 */
class Fresher extends Candidate {
    private String graduationDate, graduationRank, education;
    
    public Fresher(String candidateId, String firstName, String lastName, String birthDate, 
                   String address, String phone, String email, String graduationDate, 
                   String graduationRank, String education) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, 1);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }
}