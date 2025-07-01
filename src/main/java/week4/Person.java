/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Person {
    protected int id;
    protected String fullName;
    protected String phone;
    protected int yearOB;
    protected String major;

    public Person() {
        this.id =0;
        this.fullName ="";
        this.phone = "";
        this.yearOB = 0;
        this.major = "";
    }
    public void inputAll(Scanner sc){
       while (true) {
            System.out.print("ID: ");
            try {
                id = Integer.parseInt(sc.nextLine());
                if (Utils.isValidId(id)) break;
            } catch (NumberFormatException e) {
                // Do nothing, prompt will repeat
            }
            System.out.println("Data input is invalid");
        }

        while (true) {
            System.out.print("Fullname: ");
            fullName = sc.nextLine();
            if (Utils.isValidName(fullName)) break;
            System.out.println("Data input is invalid");
        }

        while (true) {
            System.out.print("Phone number: ");
            phone = sc.nextLine();
            if (Utils.isValidPhoneNumber(phone)) break;
            System.out.println("Data input is invalid");
        }

        while (true) {
            System.out.print("Year of birth: ");
            yearOB= sc.nextInt();
            sc.nextLine();
            if (Utils.isValidYearOfBirth(yearOB)) break;
            System.out.println("Data input is invalid");
        }

        while (true) {
            System.out.print("Major: ");
            major = sc.nextLine();
            if (Utils.isValidMajor(major)) break;
            System.out.println("Data input is invalid");
        }
    }

    @Override
    public String toString() {
        return String.format("%d - %s - %s - %d - %s\n", id, fullName, phone, yearOB, major);
    }
}
