package com.bridgelabz;

import java.util.Scanner;

public class EvenOdd {
    public EvenOdd() {
    }

    public void evenOdd() {
        System.out.println("Enter the number to calculate if it's even or odd : ");
        Scanner numberScan = new Scanner(System.in);
        int number = numberScan.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else System.out.println("The number is odd.");
    }
}
