/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Shopping {
    private List<Fruit> fruits;
    private Hashtable<String, Order> orders;

    public Shopping() {
        this.fruits = new ArrayList<>();
        this.orders = new Hashtable<>();
    }

    // Tạo mới một loại trái cây
    public void createFruit(String fruitId, String name, double price, int quantity, String origin) {
        fruits.add(new Fruit(fruitId, name, price, quantity, origin));
    }

    // Lấy thông tin trái cây bằng tên
    public Fruit getFruitByName(String fruitName) {
        for (Fruit fruit : fruits) {
            if (fruit.getName().equalsIgnoreCase(fruitName)) {
                return fruit;
            }
        }
        return null;
    }

    // Hiển thị danh sách trái cây
    public void displayFruits() {
        System.out.println("List of Fruit:");
        System.out.println("| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ |");
        for (int i = 0; i < fruits.size(); i++) {
            Fruit fruit = fruits.get(i);
            System.out.printf("| %-10d | %-15s | %-10s | %-10.2f$ |\n", (i + 1), fruit.getName(), fruit.getOrigin(), fruit.getPrice());
        }
    }

    // Mua hàng
    public void shopping() {
        Scanner scanner = new Scanner(System.in);
        List<OrderItem> items = new ArrayList<>();

        while (true) {
            displayFruits();
            System.out.print("Select item (or 0 to finish): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng new line

            if (choice == 0) {
                break;
            }

            if (choice < 1 || choice > fruits.size()) {
                System.out.println("Invalid choice!");
                continue;
            }

            Fruit selectedFruit = fruits.get(choice - 1);
            System.out.println("You selected: " + selectedFruit.getName());
            System.out.print("Please input quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng new line

            if (quantity > selectedFruit.getQuantity()) {
                System.out.println("Not enough quantity in stock!");
                continue;
            }

            // Thêm vào giỏ hàng
            items.add(new OrderItem(selectedFruit.getName(), quantity, selectedFruit.getPrice()));

            System.out.print("Do you want to order now (Y/N)? ");
            String confirm = scanner.nextLine();
            if (confirm.equalsIgnoreCase("Y")) {
                break;
            }
        }

        if (!items.isEmpty()) {
            System.out.print("Input your name: ");
            String customerName = scanner.nextLine();

            // Tạo đơn hàng và lưu vào danh sách đơn hàng
            Order order = new Order(customerName);
            for (OrderItem item : items) {
                order.addItem(item);
            }
            orders.put(customerName, order);
            System.out.println("Order placed successfully!");
        }
    }

    // Xem đơn hàng
    public void viewOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders to display.");
            return;
        }

        for (String customerName : orders.keySet()) {
            Order order = orders.get(customerName);
            order.viewOrder();
        }
    }
}
