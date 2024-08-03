package org.example;

public class Diff21 {
    public int diff21(int n) {
        // Calculate the difference between n and 21
        int difference = 21 - n;

        // Check if n is greater than 21
        if (n > 21) {
            // If n is over 21, return double the absolute difference
            return Math.abs(difference) * 2;
        } else {
            // If n is 21 or less, return the absolute difference
            return Math.abs(difference);
        }
    }
}
