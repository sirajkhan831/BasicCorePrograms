package com.bridgelabz;

import java.util.Scanner;

public class LargestNumber {
    public LargestNumber() {
    }

    public void largestNumber() {
        System.out.println("Enter the first number : ");
        Scanner numberScan1 = new Scanner(System.in);
        int a = numberScan1.nextInt();
        System.out.println("Enter the second number : ");
        Scanner numberScan2 = new Scanner(System.in);
        int b = numberScan2.nextInt();
        System.out.println("Enter the third number : ");
        Scanner numberScan3 = new Scanner(System.in);
        int c = numberScan3.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is the greatest.");
            } else System.out.println(c + " is the greatest.");
        } else if (b > c) {
            System.out.println(b + " is the greatest.");
        }
    }
}
