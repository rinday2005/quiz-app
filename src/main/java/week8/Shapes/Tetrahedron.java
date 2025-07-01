/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.Shapes;

/**
 *
 * @author ADMIN
 */
class Tetrahedron extends ThreeDimensionalShape {
    private double side;
    
    public Tetrahedron(double side) {
        this.side = side;
    }
    
    @Override
    public double getArea() {
        return Math.sqrt(3) * side * side;
    }
    
    @Override
    public double getVolume() {
        return (1.0 / 12.0) * Math.sqrt(2) * Math.pow(side, 3);
    }
}
