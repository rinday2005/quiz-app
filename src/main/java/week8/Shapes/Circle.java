/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.Shapes;

/**
 *
 * @author ADMIN
 */
class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
     public double getArea() {
        return Math.PI * radius * radius;
    }
}
