package org.example;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        // We're only in trouble if the parrot is talking
        if (talking) {
            // Check if the hour is before 7 or after 20
            // We can combine these conditions with the OR operator (||)
            if (hour < 7 || hour > 20) {
                // If the parrot is talking and it's before 7 or after 20, we're in trouble
                return true;
            }
        }

        // If we've reached this point, we're not in trouble
        return false;
    }
}
