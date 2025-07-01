/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("======== Main Menu ========");
            System.out.println("1. Normal Calculator & BMI");
            System.out.println("2. Shape Calculator");
            System.out.println("3. Matrix Calculator");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.println("1. Normal Calculator");
                    System.out.println("2. BMI Calculator");
                    int sub = Integer.parseInt(sc.nextLine());
                    if (sub == 1) {
                        System.out.print("Enter first number: ");
                        double mem = Double.parseDouble(sc.nextLine());
                        while (true) {
                            System.out.print("Enter operator (+, -, *, /, ^, =): ");
                            String op = sc.nextLine();
                            if (op.equals("=")) {
                                System.out.println("Result: " + mem);
                                break;
                            }
                            System.out.print("Enter next number: ");
                            double b = Double.parseDouble(sc.nextLine());
                            mem = ComputerProgram.calculate(mem, op, b);
                            System.out.println("Memory: " + mem);
                        }
                    } else if (sub == 2) {
                        System.out.print("Enter Weight (kg): ");
                        double w = Double.parseDouble(sc.nextLine());
                        System.out.print("Enter Height (cm): ");
                        double h = Double.parseDouble(sc.nextLine());
                        double bmi = ComputerProgram.calculateBMI(w, h);
                        System.out.printf("BMI: %.2f\n", bmi);
                        System.out.println("Status: " + ComputerProgram.getBMIStatus(bmi));
                    }
                }
                case 2 -> {
                    System.out.print("Enter width of rectangle: ");
                    double width = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter length of rectangle: ");
                    double length = Double.parseDouble(sc.nextLine());

                    System.out.print("Enter radius of circle: ");
                    double radius = Double.parseDouble(sc.nextLine());

                    System.out.print("Enter side A of triangle: ");
                    double a = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter side B of triangle: ");
                    double b = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter side C of triangle: ");
                    double c = Double.parseDouble(sc.nextLine());

                    double[] rect = CalculatePerimeterAndArea.rectangle(width, length);
                    double[] circ = CalculatePerimeterAndArea.circle(radius);
                    double[] tri = CalculatePerimeterAndArea.triangle(a, b, c);

                    System.out.println("Rectangle - Area: " + rect[0] + ", Perimeter: " + rect[1]);
                    System.out.println("Circle - Area: " + circ[0] + ", Perimeter: " + circ[1]);
                    System.out.printf("Triangle - Area: %.2f, Perimeter: %.2f\n", tri[0], tri[1]);
                }
                case 3 -> {
                    int matrixChoice;
                    do {
                        System.out.println("====== Calculator program ======");
                        System.out.println("1. Addition Matrix");
                        System.out.println("2. Subtraction Matrix");
                        System.out.println("3. Multiplication Matrix");
                        System.out.println("4. Quit");
                        System.out.print("Your choice: ");
                        matrixChoice = Integer.parseInt(sc.nextLine());
                        if (matrixChoice == 4) break;

                        // Input for Matrix 1
                        System.out.print("Enter Row Matrix 1: ");
                        int r1 = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter Column Matrix 1: ");
                        int c1 = Integer.parseInt(sc.nextLine());

                        Matrix m1 = new Matrix(r1, c1);
                        System.out.println("Enter Matrix1:");
                        for (int i = 0; i < r1; i++) {
                            for (int j = 0; j < c1; j++) {
                                System.out.printf("Matrix1[%d][%d]: ", i + 1, j + 1);
                                m1.setData(i, j, sc.nextDouble());
                                sc.nextLine(); // consume newline
                            }
                        }

                        Matrix m2;

                        if (matrixChoice == 3) {
                            // Multiplication
                            System.out.print("Enter Row Matrix 2: ");
                            int r2 = Integer.parseInt(sc.nextLine());
                            System.out.print("Enter Column Matrix 2: ");
                            int c2 = Integer.parseInt(sc.nextLine());

                            if (c1 != r2) {
                                System.out.println("Matrix multiplication is not possible (Matrix1's columns must equal Matrix2's rows).");
                                continue;
                            }

                            m2 = new Matrix(r2, c2);
                            System.out.println("Enter Matrix2:");
                            for (int i = 0; i < r2; i++) {
                                for (int j = 0; j < c2; j++) {
                                    System.out.printf("Matrix2[%d][%d]: ", i + 1, j + 1);
                                    m2.setData(i, j, sc.nextDouble());
                                    sc.nextLine(); // consume newline
                                }
                            }

                        } else {
                            // Addition or Subtraction
                            System.out.println("Matrix2 Rows: " + r1);
                            System.out.println("Matrix2 Columns: " + c1);
                            m2 = new Matrix(r1, c1);
                            System.out.println("Enter Matrix2:");
                            for (int i = 0; i < r1; i++) {
                                for (int j = 0; j < c1; j++) {
                                    System.out.printf("Matrix2[%d][%d]: ", i + 1, j + 1);
                                    m2.setData(i, j, sc.nextDouble());
                                    sc.nextLine(); // consume newline
                                }
                            }
                        }

                        Matrix result = switch (matrixChoice) {
                            case 1 -> m1.add(m2);
                            case 2 -> m1.subtract(m2);
                            case 3 -> m1.multiply(m2);
                            default -> null;
                        };

                        System.out.println("-------- Result --------");
                        if (result != null) {
                            result.display();
                        }

                    } while (matrixChoice != 4);
                }
                case 4 -> {
                    System.out.println("Exiting program.");
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
