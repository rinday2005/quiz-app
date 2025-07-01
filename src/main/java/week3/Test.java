/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.EmptyStackException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an algorithm to demo:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Binary Search");
            System.out.println("4. Stack Operations");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    BubbleSort bs = new BubbleSort();
                    System.out.println("Enter number of array");
                    int number = sc.nextInt();
                    bs.generateRandomArray(number);
                    System.out.println("Unsorted array: ");
                    bs.showArray();
                    bs.sort();
                    System.out.println("\n");

                    System.out.println("Sorted array: ");
                    bs.showArray();
                    System.out.println("\n");

                    break;
                }
                case 2: {
                    QuickSort qs = new QuickSort();
                    System.out.println("Enter number of array");
                    int number = sc.nextInt();
                    qs.generateRandomArray(number);
                    int[] arr = qs.getArray();
                    System.out.println("Unsorted array: ");
                    qs.showArray();
                    System.out.println("\n");
                    qs.quickSort(arr, 0, arr.length - 1);
                    System.out.println("Sorted array: ");
                    qs.showArray();
                    System.out.println("\n");
                    break;
                }
                case 3: {
                    BinarySearch binarySearch = new BinarySearch();
                    QuickSort qs = new QuickSort();

                    System.out.println("Enter number of array");
                    int number = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter search value");
                    int value = sc.nextInt();
                    
                    //sắp xếp
                    qs.generateRandomArray(number);
                    int[] arr = qs.getArray();
                    qs.quickSort(arr, 0, arr.length - 1);
                    System.out.println("Sorted array: ");
                    qs.showArray();
                    System.out.println("\n");
                    
                    //tìm kiếm
                    int result = binarySearch.binarySearch(arr, value);
                    if (result != -1) {
                        System.out.println("Index " + value + " found at index: " + result);
                    } else {
                        System.out.println("Index " + value + " not found in the array.");
                    }
                    break;

                }
                case 4:
                    MyStack stack = new MyStack();

                    System.out.println("Stack Operations:");
                    while (true) {
                        System.out.println("1. Push");
                        System.out.println("2. Pop");
                        System.out.println("3. Get Top");
                        System.out.println("4. Exit");
                        System.out.print("Choose an option: ");
                        int n = sc.nextInt();

                        switch (n) {
                            case 1:
                                System.out.print("Enter a value to push: ");
                                int value = sc.nextInt();
                                stack.push(value);
                                break;
                            case 2:
                                try {
                                    System.out.println("Popped value: " + stack.pop());
                                } catch (EmptyStackException e) {
                                    System.out.println("Stack is empty.");
                                }
                                break;
                            case 3:
                                try {
                                    System.out.println("Top value: " + stack.get());
                                } catch (EmptyStackException e) {
                                    System.out.println("Stack is empty.");
                                }
                                break;
                            case 4:
                                return;
                            default:
                                System.out.println("Invalid choice. Try again.");
                        }
                    }

                case 5:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

