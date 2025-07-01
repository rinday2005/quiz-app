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
public class QuickSort {
    private int array[];

    public void generateRandomArray(int size) {

        array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }

    }

    void showArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public void quickSort(int[] arr, int low, int high) {
        
        int i = partition(arr, low, high);
        if (i < high) {
            quickSort(arr, i, high);
        }
        if (low < i - 1) {
                quickSort(arr, low, i - 1);
        }
        
    }

    public int partition(int[] arr, int low, int high) {

        int i = low;
        int j = high;
        int pv = arr[(i + j) / 2];
        while (i <= j) {
            while (arr[i] < pv) {
                i++;
            }
            while (arr[j] > pv) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }

    public int[] getArray() {
        return array;
    }
}
