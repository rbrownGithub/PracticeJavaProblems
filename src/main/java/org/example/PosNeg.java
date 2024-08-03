package org.example;

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        // If negative is true, we only return true if both a and b are negative
        if (negative) {
            return (a < 0 && b < 0);
        }
        // If negative is false, we return true if one is positive and one is negative
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }
}