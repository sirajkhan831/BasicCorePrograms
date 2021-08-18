package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public LeapYear() {
    }
    public void leapYear(){
        int year;
        System.out.println("Enter year to check if it's leap year : ");
        Scanner yearScan = new Scanner(System.in);
        year = yearScan.nextInt();
        boolean leapCheck = false;

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0)
                    leapCheck = true;
            } else
                leapCheck = true;
        }

        if (leapCheck)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
