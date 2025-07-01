/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.Shapes;

/**
 *
 * @author ADMIN
 */
public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5), new Square(4), new Triangle(3, 6),
            new Sphere(5), new Cube(4), new Tetrahedron(3)
        };
        
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof TwoDimensionalShape) {
                System.out.println("Area: " + ((TwoDimensionalShape) shape).getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                System.out.println("Area: " + ((ThreeDimensionalShape) shape).getArea());
                System.out.println("Volume: " + ((ThreeDimensionalShape) shape).getVolume());
            }
            System.out.println();
        }
    }
}

