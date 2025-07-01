/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author ADMIN
 */
public class ComputerProgram {
    public static double calculate(double a, String operator, double b) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) throw new ArithmeticException("Cannot divide by zero");
                return a / b;
            case "^": return Math.pow(a, b);
            default: throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 19) return "Under-standard";
        if (bmi < 25) return "Standard";
        if (bmi < 30) return "Overweight";
        if (bmi <= 40) return "Fat - should lose weight";
        return "Very fat - should lose weight immediately";
    }
}


