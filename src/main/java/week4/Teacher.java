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
public class Teacher extends Person{
    private int yearPro;
    private String contactType;
    private double salary;

    public Teacher() {
        super();
        this.yearPro = 0;
        this.contactType = "";
        this.salary = 0.0;
    }
    public void inputAll(Scanner sc){
        super.inputAll(sc);
                while (true) {
            System.out.print("Year in the profession: ");
            yearPro = sc.nextInt();
            sc.nextLine();
            if (Utils.isValidYearInProfession(yearPro, yearOB)) break;
            System.out.println("Data input is invalid");
        }

        while (true) {
            System.out.print("Contract type (Long/Short): ");
            contactType = sc.nextLine();
            if (Utils.isValidContractType(contactType)) break;
            System.out.println("Data input is invalid");
        }

        while (true) {
            System.out.print("Salary coefficient: ");
            salary = sc.nextDouble();
            sc.nextLine();
            if (Utils.isValidSalaryCoefficient(salary)) break;
            System.out.println("Data input is invalid");
        }
    }


    @Override
    public String toString() {
        return super.toString()+String.format(" - %d - %s - %.1f\n", yearPro, contactType, salary);
    }
    
}
