/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Test {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        

        while (true) {
            System.out.println("*** Program Selector ***");
            System.out.println("1. Large Number (Bai 1)");
            System.out.println("2. Room Reservation (Bai 2)");
            System.out.println("3. Course Management (Bai 3)");
            System.out.println("4. Exit");
            System.out.print("You choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    runLargeNumber(sc);
                    break;
                case 2:
                    runRoomReservation(sc);
                    break;
                case 3:
                    runCourseManagement(sc);
                    break;
                case 4:
                    System.out.println("BYE AND SEE YOU NEXT TIME!");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    // Bài 1: Large Number
    private static void runLargeNumber(Scanner sc) {
        System.out.println("*** Large Number Program ***");
        System.out.print("Enter first number: ");
        String num1 = sc.nextLine();

        System.out.print("Enter second number: ");
        String num2 = sc.nextLine();

        BigNum bignum = new BigNum();

        System.out.println("Addition result: " + BigNum.plus(num1, num2));
        System.out.println("Multiplication result: " + BigNum.multiplication(num1, num2));
    }
    // Bài 2: Room Reservation
    private static void runRoomReservation(Scanner sc) {
        List<Reservation> reservations = new ArrayList<>();

        while (true) {
            System.out.println("*** Reservation Management ***");
            System.out.println("1. Create new reservation");
            System.out.println("2. Print all reservations");
            System.out.println("3. Back to main menu");
            System.out.print("You choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            if (choice == 1) {
                System.out.print("Enter booking ID: ");
                String id = sc.nextLine();

                System.out.print("Enter customer name: ");
                String name = sc.nextLine();

                System.out.print("Enter phone number: ");
                String phone = sc.nextLine();

                System.out.print("Enter room number: ");
                String room = sc.nextLine();

                System.out.print("Enter booking date: ");
                String date = sc.nextLine();

                System.out.print("Need airport pick up? (Y/N): ");
                String pickUp = sc.nextLine();
                FlightInformation flightInfo = null;
                if (pickUp.equalsIgnoreCase("Y")) {
                    System.out.print("Enter flight number: ");
                    String flightNum = sc.nextLine();

                    System.out.print("Enter seat number: ");
                    String seat = sc.nextLine();

                    System.out.print("Enter pick-up time: ");
                    String time = sc.nextLine();

                    flightInfo = new FlightInformation(flightNum, seat, time);
                }

                reservations.add(new Reservation(id, name, phone, room, date, flightInfo));
                System.out.println("Reservation created successfully!");
            } else if (choice == 2) {
                System.out.println("*** All Reservations ***");
                for (Reservation r : reservations) {
                    System.out.println(r);
                }
            } else if (choice == 3) {
                break;
            }
        }
    }

    // Bài 3: Course Management
    private static void runCourseManagement(Scanner scanner) throws Exception {
        CourseManagerment cm = new CourseManagerment();
        List<Course> courses = new ArrayList<>();
        

        while (true) {
            System.out.println("\nCourse Management System");
            System.out.println("1. Add Online Course");
            System.out.println("2. Add Offline Course");
            System.out.println("3. Delete Course");
            System.out.println("4. Update Course");
            System.out.println("5. Display Online Courses");
            System.out.println("6. Display Offline Courses");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Online Course ID: ");
                    String onlineId = scanner.nextLine();
                    System.out.print("Enter Online Course Name: ");
                    String onlineName = scanner.nextLine();
                    System.out.print("Enter Credit: ");
                    int credit = scanner.nextInt();
                    System.out.print("Enter Platform: ");
                    String platform = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("Enter Course Instructor: ");
                    String instructor = scanner.nextLine();
                    System.out.print("Enter Note: ");
                    String note = scanner.nextLine();
                    scanner.nextLine(); // Consume newline
                    OnlineCourse onlineCourse = new OnlineCourse();
                    onlineCourse.InputAll(onlineId, onlineName,credit, platform, instructor, note);
                    cm.addOnlineCourse(onlineCourse);
                    System.out.println("Online Course added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Offline Course ID: ");
                    String offlineId = scanner.nextLine();
                    System.out.print("Enter Offline Course Name: ");
                    String offlineName = scanner.nextLine();
                    System.out.print("Enter Credit: ");
                    credit = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Begin: ");
                    String startDate = scanner.nextLine();
                    System.out.print("Enter End : ");
                    String endDate = scanner.nextLine();
                    System.out.print("Enter Campus: ");
                    String location = scanner.nextLine();
                    OfflineCourse offlineCourse = new OfflineCourse();
                    offlineCourse.InputAll(offlineId, offlineName, credit, startDate, endDate, location);
                    cm.addOfflineCourse(offlineCourse);
                    System.out.println("Offline Course added successfully.");
                    break;
                case 3:
                    System.out.print("Enter Course ID to delete: ");
                    String delId = scanner.nextLine();
                    if (cm.deleteCourse(delId)) {
                        System.out.println("Course deleted successfully.");
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Course ID to update: ");
                    String updateId = scanner.nextLine();
                    cm.upadateCourse(updateId);
                    System.out.println("Course updated successfully.");
                    break;
                case 5:
                    cm.displayOnlineCourse();
                    break;
                case 6:
                    cm.displayOfflineCourses();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
