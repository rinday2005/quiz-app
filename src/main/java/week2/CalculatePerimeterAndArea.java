/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;


/**
 *
 * @author ADMIN
 */
public class CalculatePerimeterAndArea {   
    public static double[] rectangle(double width, double length) {
        return new double[] { width * length, 2 * (width + length) };
    }

    public static double[] circle(double radius) {
        return new double[] { Math.PI * radius * radius, 2 * Math.PI * radius };
    }

    public static double[] triangle(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        double perimeter = a + b + c;
        return new double[] { area, perimeter };
    }
}
//khai báo phương thức tĩnh static: pt thuộc về lớp, không phụ thuộc vào đối tượng (instance), gọi