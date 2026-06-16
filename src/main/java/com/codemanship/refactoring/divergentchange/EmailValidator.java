package com.codemanship.refactoring.divergentchange;

public class EmailValidator {
    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }
}
