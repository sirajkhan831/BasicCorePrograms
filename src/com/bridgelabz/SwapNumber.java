package com.bridgelabz;

import java.util.Scanner;

public class SwapNumber {
    public SwapNumber() {
    }

    public void swapNumber() {
        System.out.println("Enter the first number to swap : ");
        Scanner numberScan = new Scanner(System.in);
        int number = numberScan.nextInt();
        System.out.println("Enter the second number to swap : ");
        Scanner numberScan1 = new Scanner(System.in);
        int number1 = numberScan1.nextInt();
        int temp;
        temp = number;
        number = number1;
        number1 = temp;
        System.out.println("The numbers have been successfully swapped number 1 is now " + number + " and number 2 is now " + number1);
    }
}
