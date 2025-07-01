/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Test {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerStudents manager = new ManagerStudents();

        while (true) {
            System.out.println("\n----- STUDENT MANAGEMENT -----");
            System.out.println("1. Add student");
            System.out.println("2. Show all students");
            System.out.println("3. Find student by name");
            System.out.println("4. Delete student by ID");
            System.out.println("5. Sort students by name");
            System.out.println("6. Report students");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter semester: ");
                    String semester = sc.nextLine();

                    System.out.print("Enter course: ");
                    String course = sc.nextLine();

                    Students student = new Students(id, name, semester, course);
                    if (manager.addStudents(student)) {
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Failed to add student (duplicate or cancelled).");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Student List ---");
                    manager.showStudents();
                    break;

                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = sc.nextLine();
                    List<Students> foundStudents = manager.findStudents(searchName);
                    if (!foundStudents.isEmpty()) {
                        System.out.println("\n--- Found Students ---");
                        for (Students st : foundStudents) {
                            System.out.println(st);
                        }
                    } else {
                        System.out.println("No students found with name: " + searchName);
                    }
                    break;

                case 4:
                    System.out.print("Enter student ID to delete: ");
                    String deleteId = sc.nextLine();
                    if (manager.deleteStudent(deleteId) == 1) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    manager.sortStudents();
                    System.out.println("Students sorted by name.");
                    break;

                case 6:
                    System.out.println("\n--- Student Report ---");
                    manager.reportStudent();
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
