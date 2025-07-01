/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.Shapes;

/**
 *
 * @author ADMIN
 */
abstract class ThreeDimensionalShape extends Shape{
    public abstract double getArea();
    public abstract double getVolume();

    @Override
    public void display(){
        System.out.println(this.getClass().getSimpleName() + " - Area " + getArea() + ", Volume " + getVolume());
    }   
}