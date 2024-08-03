package org.example;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        // We need to return true if we sleep in, false otherwise.

        // We sleep in if:
        // 1. It's not a weekday (weekday is false)
        // 2. OR we're on vacation (vacation is true)

        // We can express this using the logical OR operator (||)
        // !weekday gives us the opposite of weekday, so it's true on weekends

        return !weekday || vacation;

        // This will return true if either:
        // - It's not a weekday (!weekday is true)
        // - OR we're on vacation (vacation is true)
        // It will only return false if it's a weekday AND we're not on vacation
    }
}