/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("--------MENU--------");
            System.out.println("1. Linear Search");
            System.out.println("2. Count Letter And Character");
            System.out.println("3. Change Base Of Number");
            System.out.println("4. Solving Equation");
            System.out.println("5. Exit");
            System.out.println("---------------------");
            System.out.println("Please Enter your choice");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("Enter number of array:");

                    int size = sc.nextInt();
                    LinearSearch ls = new LinearSearch(size);

                    ls.addValue(size);
                    System.out.println("Enter search value:");
                    int value = sc.nextInt();
                    int result = ls.searchValue(value);
                    System.out.println("The value");
                    ls.showArray();
                    if (result != -1) {
                        System.out.println("Found " + value + " at index: " + result);
                    } else {
                        System.out.println("Value" + value + "Not found");
                    }

                }
                break;

                case 2: {
                    System.out.println("Enter your content: ");
                    String text = sc.nextLine();
                    CountWC count = new CountWC(text);
                    System.out.println(count.countWords());
                    System.out.println(count.countCharacter());

                }
                break;

                case 3:
                    int n;
                    do {

                        System.out.println("Choose the option:");
                        System.out.println("1. Binary to decimal");
                        System.out.println("2. Decimal to Binary");
                        System.out.println("3. Decimal to Hexadecimal");
                        System.out.println("4 Exit");
                        ChangeBaseNumber change = new ChangeBaseNumber();

                        n = sc.nextInt();
                        sc.nextLine();
                        switch (n) {
                            case 1: {
                                System.out.println("Enter binary");
                                String binary = sc.nextLine();
                                int value = change.binaryToDecimal(binary);
                                System.out.println("Change to decimal: " + value);
                                break;
                            }
                            case 2: {
                                System.out.println("Enter decimal: ");
                                String decimal = sc.nextLine();
                                String binary = change.decimalToBinary(decimal);
                                System.out.println("Change to binary: " + binary);
                                break;
                            }
                            case 3: {
                                System.out.println("Enter decimal: ");
                                String decimal = sc.nextLine();
                                String hexadecimal = change.decimalToHexa(decimal);
                                System.out.println("Change to hexadecimal: " + hexadecimal);
                                break;

                            }
                        }
                    } while (n != 4);

                    break;

                case 4:
                    int ch;

                    do {
                        System.out.println("========= Equation Program =========");
                        System.out.println("1. Calculate Superlative Equation(ax+b=0)");
                        System.out.println("2. Calculate Quadratic Equation(ax^2+bx+c=0)");
                        System.out.println("3. Exit");

                        Calculate cal = new Calculate();
                        System.out.println("Choose option: ");
                        ch = sc.nextInt();
                        sc.nextLine();
                        switch (ch) {
                            case 1: {
                                System.out.println("----- Calculate Equation ----- ");
                                System.out.println("Enter a:");
                                double a = sc.nextDouble();
                                sc.nextLine();
                                System.out.println("Enter b:");
                                double b = sc.nextDouble();
                                cal.superlativeEquation(a, b);

                                break;
                            }
                            case 2: {
                                System.out.println("----- Calculate Quadratic Equation -----");
                                System.out.println("Enter a:");
                                double a = sc.nextDouble();
                                sc.nextLine();
                                System.out.println("Enter b:");
                                double b = sc.nextDouble();
                                sc.nextLine();
                                System.out.println("Enter c:");
                                double c = sc.nextDouble();
                                cal.quadraticEquation(a, b, c);
                                break;

                            }
                        }
                    } while (ch != 3);
                    break;

            }
        } while (choice != 5);
    }
}
