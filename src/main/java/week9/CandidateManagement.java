/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class CandidateManagement {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<Candidate> candidates = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Internship");
            System.out.println("4. Searching");
            System.out.println("5. Exit");
            System.out.print("Please choose: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1: createCandidate(0); break;
                case 2: createCandidate(1); break;
                case 3: createCandidate(2); break;
                case 4: searchCandidate(); break;
                case 5: return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    private static void createCandidate(int type) {
        System.out.print("Enter Candidate ID: ");
        String id = sc.nextLine();
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter Birth Year (1900 - 2025): ");
        String birthDate = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Phone (10+ digits): ");
        String phone = sc.nextLine();
        System.out.print("Enter Email (example@domain.com): ");
        String email = sc.nextLine();

        if (!isValidBirthDate(birthDate) || !isValidPhone(phone) || !isValidEmail(email)) {
            System.out.println("Invalid input! Try again.");
            return;
        }

        Candidate candidate;
        if (type == 0) {
            System.out.print("Enter Years of Experience (0-100): ");
            int expInYear = sc.nextInt(); sc.nextLine();
            System.out.print("Enter Professional Skill: ");
            String proSkill = sc.nextLine();
            candidate = new Experience(id, firstName, lastName, birthDate, address, phone, email, expInYear, proSkill);
        } else if (type == 1) {
            System.out.print("Enter Graduation Date: ");
            String gradDate = sc.nextLine();
            System.out.print("Enter Graduation Rank (Excellence, Good, Fair, Poor): ");
            String gradRank = sc.nextLine();
            System.out.print("Enter University Name: ");
            String education = sc.nextLine();
            candidate = new Fresher(id, firstName, lastName, birthDate, address, phone, email, gradDate, gradRank, education);
        } else {
            System.out.print("Enter Majors: ");
            String majors = sc.nextLine();
            System.out.print("Enter Semester: ");
            String semester = sc.nextLine();
            System.out.print("Enter University Name: ");
            String university = sc.nextLine();
            candidate = new Intern(id, firstName, lastName, birthDate, address, phone, email, majors, semester, university);
        }
        candidates.add(candidate);
        System.out.println("Candidate added successfully!");
    }

    private static void searchCandidate() {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();
        System.out.print("Enter candidate type (0-2): ");
        int type = sc.nextInt(); sc.nextLine();

        candidates.stream()
                  .filter(c -> (c.getFullName().toLowerCase().contains(name.toLowerCase()) && c.getCandidateType() == type))
                  .forEach(System.out::println);
    }

    private static boolean isValidBirthDate(String birthDate) {
        return birthDate.matches("(19[0-9]{2}|20[0-2][0-5])");
    }
    private static boolean isValidPhone(String phone) {
        return phone.matches("\\d{10,}");
    }
    private static boolean isValidEmail(String email) {
        return email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
    }
}
