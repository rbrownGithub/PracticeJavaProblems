package org.example;

public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // We're in trouble if both monkeys are smiling (true, true)
        // or if neither monkey is smiling (false, false)

        // We can check this with a logical OR (||) of two conditions:
        // 1. aSmile == bSmile checks if both booleans are the same (both true or both false)
        // 2. This covers both our trouble scenarios

        return aSmile == bSmile;

        // This will return true if:
        // - Both aSmile and bSmile are true
        // - Both aSmile and bSmile are false
        // It will return false if aSmile and bSmile are different
    }
}
