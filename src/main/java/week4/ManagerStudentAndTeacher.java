/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ManagerStudentAndTeacher {
    private static List<Teacher> teachers = new ArrayList<>();
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("*** Information Management ***");
            System.out.println("1. Teacher");
            System.out.println("2. Student");
            System.out.println("3. Person");
            System.out.println("4. Exit");
            System.out.print("You choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    manageTeachers(sc);
                    break;
                case 2:
                    manageStudents(sc);
                    break;
                case 3:
                    managePersons(sc);
                    break;
                case 4:
                    System.out.println("BYE AND SEE YOU NEXT TIME");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void manageTeachers(Scanner sc) {
        while (true) {
            System.out.println("*** Teacher Management ***");
            System.out.println("1. Input");
            System.out.println("2. Print");
            System.out.println("3. Exit");
            System.out.print("You choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Teacher teacher = new Teacher();
                    teacher.inputAll(sc);
                    teachers.add(teacher);
                    break;
                case 2:
                    for (Teacher t : teachers) {
                       System.out.println(t.toString());
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void manageStudents(Scanner sc) {
        while (true) {
            System.out.println("*** Student Management ***");
            System.out.println("1. Input");
            System.out.println("2. Print");
            System.out.println("3. Exit");
            System.out.print("You choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Student student = new Student();
                    student.inputAll(sc);
                    students.add(student);
                    break;
                case 2:
                    for (Student s : students) {
                        System.out.println(s.toString());
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void managePersons(Scanner sc) {
        while (true) {
            System.out.println("*** Person Management ***");
            System.out.println("1. Search");
            System.out.println("2. Print all");
            System.out.println("3. Exit");
            System.out.print("You choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    boolean found = false;
                    for (Person p : teachers) {
                        if (p.fullName.contains(name)) {
                           System.out.println(p.toString());
                            found = true;
                        }
                    }
                    for (Person p : students) {
                        if (p.fullName.contains(name)) {
                           System.out.println(p.toString());
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Result: not found");
                    }
                    break;
                case 2:
                    List<Person> allPersons = new ArrayList<>();
                    allPersons.addAll(teachers);
                    allPersons.addAll(students);
                    for (Person p : allPersons) {
                        System.out.println(p.toString());
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
