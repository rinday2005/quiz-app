/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.Shapes;

/**
 *
 * @author ADMIN
 */
class Sphere extends ThreeDimensionalShape {
    private double radius;
    
    public Sphere(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }
    
    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
