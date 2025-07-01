/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class BubbleSort {
    private int array[];

    public BubbleSort() {
    }
    
        public BubbleSort(int[] array) {
        this.array = array;
    }
    
    public void generateRandomArray(int size) {
        array = new int[size];
        Random rd = new Random();
        
        for(int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(array.length);
        }
    }
    
    void showArray() {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
    
    void sort(){
        int n = array.length;
        int c = 0;
        boolean check = false;
        for ( int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1 - i; j++) {
                c++;
                if( array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    check = false;
                }
            }
        }
        System.out.println("\nSo lan lap: " + c);
    }
    public int[] getArray() {
        return array;
    }
}
