/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Matrix {
    private int row, col;
    private double[][] data;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        data = new double[row][col];
    }

    public void setData(int r, int c, double value) {
        this.data[r][c] = value;
    }

    public double getData(int r, int c) {
        return this.data[r][c];
    }

    public void setData(double[][] data) {
        this.data = data;
    }

    public Matrix add(Matrix m) {
        if (this.row != m.row || this.col != m.col) {
            System.out.println("Matrix dimensions do not match for addition.");
            return null;
        }
        Matrix result = new Matrix(row, col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result.data[i][j] = this.data[i][j] + m.data[i][j];
            }
        }
        return result;
    }

    public Matrix subtract(Matrix m) {
        if (this.row != m.row || this.col != m.col) {
            System.out.println("Matrix dimensions do not match for subtraction.");
            return null;
        }
        Matrix result = new Matrix(row, col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result.data[i][j] = this.data[i][j] - m.data[i][j];
            }
        }
        return result;
    }

    public Matrix multiply(Matrix m) {
        if (this.col != m.row) {
            System.out.println("Matrix dimensions do not allow multiplication.");
            return null;
        }
        Matrix result = new Matrix(this.row, m.col);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < m.col; j++) {
                double sum = 0;
                for (int k = 0; k < this.col; k++) {
                    sum += this.data[i][k] * m.data[k][j];
                }
                result.data[i][j] = sum;
            }
        }
        return result;
    }

    public void display() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%10.2f", data[i][j]);
            }
            System.out.println();
        }
    }
}
