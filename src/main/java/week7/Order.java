/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Order {
    private String customerName;
    private List<OrderItem> orderItems;

    public Order(String customerName) {
        this.customerName = customerName;
        this.orderItems = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void viewOrder() {
        double totalAmount = 0;
        System.out.println("Customer: " + customerName);
        System.out.println("Product | Quantity | Price | Amount");
        for (OrderItem item : orderItems) {
            System.out.printf("%-8s | %-8d | %-5.2f$ | %-5.2f$\n", item.getProductName(), item.getQuantity(), item.getPrice(), item.getAmount());
            totalAmount += item.getAmount();
        }
        System.out.println("Total: " + totalAmount + "$");
        System.out.println();
    }
}
