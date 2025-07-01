/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

/**
 *
 * @author ADMIN
 */
public class Fruit {
    private String fruitId;
    private String name;
    private double price;
    private int quantity;
    private String origin;

    public Fruit(String fruitId, String name, double price, int quantity, String origin) {
        this.fruitId = fruitId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
    }

    public String getFruitId() {
        return fruitId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getOrigin() {
        return origin;
    }

    @Override
    public String toString() {
        return "Fruit{" + "fruitId=" + fruitId + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", origin=" + origin + '}';
    }
}
