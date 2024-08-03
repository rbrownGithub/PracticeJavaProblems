package org.example;

public class SumDouble {
    public int sumDouble(int a, int b) {
        // First, calculate the sum of a and b
        int sum = a + b;

        // Check if a and b are the same
        if (a == b) {
            // If they're the same, return double the sum
            return sum * 2;
        } else {
            // If they're different, return the regular sum
            return sum;
        }
    }
}
