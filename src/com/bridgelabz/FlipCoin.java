package com.bridgelabz;

public class FlipCoin {

    public FlipCoin() {

    }

    public void flipCoin() {
        String result;
        int countHead = 0;
        int countTail = 0;
        for (int i = 0; i <= 10; i++) {
            int flip = (int) Math.floor(Math.random() * 2);
            if (flip == 0) {
                result = "Heads";
                countHead++;
            } else result = "Tails";
            countTail++;
        }
        System.out.println(countHead);
        System.out.println(countTail);
    }
}