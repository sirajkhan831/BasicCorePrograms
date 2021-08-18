package com.bridgelabz;

import java.util.Scanner;

public class BasicCoreProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to a list of Basic Core Java Programs.");
        System.out.println("Enter your choice of program : 1. Flip Coin " +
                "2. Leap Year " +
                "3. Power of (2) " +
                "4. Harmonic Number " +
                "5. Prime Factors " +
                "6. Quotient & Remainder " +
                "7. Swap Numbers " +
                "8. Even Odd Finder " +
                "9. Largest Number " +
                "10. Vowel & Consonants.");
        Scanner optionScan = new Scanner(System.in);
        int option = optionScan.nextInt();
        switch (option) {
            case 1:
                FlipCoin flipCoin = new FlipCoin();
                flipCoin.flipCoin();
                break;
            case 2:
                LeapYear leapYear = new LeapYear();
                leapYear.leapYear();
                break;
            case 3:
                powerOf2 powerOf2 = new powerOf2();
                powerOf2.powerOf2();
                break;
            case 4:
                HarmonicNumber harmonicNumber = new HarmonicNumber();
                harmonicNumber.harmonicNumber();
                break;
            case 5:
                Factors factors = new Factors();
                factors.factors();
                break;
            case 6:
                QuotientRemainder quotientRemainder = new QuotientRemainder();
                quotientRemainder.quotientRemainder();
                break;
            case 7:
                SwapNumber swapNumber = new SwapNumber();
                swapNumber.swapNumber();
                break;
            case 8:
                EvenOdd evenOdd = new EvenOdd();
                evenOdd.evenOdd();
                break;
            case 9:
                LargestNumber largestNumber = new LargestNumber();
                largestNumber.largestNumber();
                break;
            case 10:
                vowels vowels = new vowels();
                vowels.Vowels();
                break;
            default:
                System.out.println("Please choose correct options.");
        }
    }
}
