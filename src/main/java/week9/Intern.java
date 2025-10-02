/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

/**
 *
 * @author ADMIN
 */
class Intern extends Candidate {
    private String majors, semester, universityName;
    
    public Intern(String candidateId, String firstName, String lastName, String birthDate, 
                  String address, String phone, String email, String majors, 
                  String semester, String universityName) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, 2);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }
}