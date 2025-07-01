/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.Shapes;

/**
 *
 * @author ADMIN
 */
  public abstract class TwoDimensionalShape extends Shape{
    public abstract double getArea();

    @Override
    public void display(){
        System.out.println(this.getClass().getSimpleName() +  " - Area" + getArea());
    }
}

