package com.bridgelabz;

import java.util.Scanner;

public class powerOf2 {
    public powerOf2() {
    }
    public void powerOf2(){
        System.out.println("Enter a number for power of 2 : ");
        Scanner numberScan = new Scanner(System.in);
        int number = numberScan.nextInt();
        int num = 2;
        for (int i = 1;i < number; i++)
        {
             num *= 2;
        }
        System.out.println(num);
    }
}
