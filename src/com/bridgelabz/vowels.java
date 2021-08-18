package com.bridgelabz;

import java.util.Scanner;

public class vowels {
    public vowels() {
    }

    public void Vowels() {
        System.out.println("Enter an alphabet to check weather it's vowel or consonant (use only small case): ");
        Scanner alphabetScanner = new Scanner(System.in);
        String alphabet = alphabetScanner.nextLine();
        switch (alphabet) {
            case "a", "e", "i", "o", "u":
                System.out.println("The given alphabet is a vowel");
                break;
            default:
                System.out.println("The given alphabet is a consonant");
                break;
        }
    }
}
