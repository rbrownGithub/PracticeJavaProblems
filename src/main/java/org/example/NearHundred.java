package org.example;

public class NearHundred {
    public boolean nearHundred(int n) {
        // Check if n is within 10 of 100
        // Math.abs(n - 100) calculates the absolute difference between n and 100
        boolean near100 = Math.abs(n - 100) <= 10;

        // Check if n is within 10 of 200
        // Math.abs(n - 200) calculates the absolute difference between n and 200
        boolean near200 = Math.abs(n - 200) <= 10;

        // Return true if n is near 100 OR near 200
        return near100 || near200;
    }
}
