package com.codemanship.refactoring.divergentchange;

public class CustomerDisplayFormat {
    public static String formatDisplayName(String firstName, String lastName) {
        return firstName.trim() + " " + lastName.trim().toUpperCase();
    }
}
