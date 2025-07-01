/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.Shapes;

/**
 *
 * @author ADMIN
 */
class Cube extends ThreeDimensionalShape {
    private double side;
    
    public Cube(double side) {
        this.side = side;
    }
    
    @Override
    public double getArea() {
        return 6 * side * side;
    }
    
    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }
}
