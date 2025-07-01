/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Test {
    public static void main(String[] args) {
        Shopping shop = new Shopping();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("FRUIT SHOP SYSTEM");
            System.out.println("1. Create Fruit");
            System.out.println("2. View Orders");
            System.out.println("3. Shopping (for buyer)");
            System.out.println("4. Exit");
            System.out.print("Please choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng new line

            switch (choice) {
                case 1:
                    System.out.print("Enter Fruit ID: ");
                    String fruitId = scanner.nextLine();
                    System.out.print("Enter Fruit Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ dòng new line
                    System.out.print("Enter Origin: ");
                    String origin = scanner.nextLine();
                    shop.createFruit(fruitId, name, price, quantity, origin);
                    System.out.println("Fruit created successfully!");
                    break;
                case 2:
                    shop.viewOrders();
                    break;
                case 3:
                    shop.shopping();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
