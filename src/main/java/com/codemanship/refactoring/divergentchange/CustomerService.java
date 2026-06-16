package com.codemanship.refactoring.divergentchange;

public class CustomerService {

    public int calculateLoyaltyPoints(int numberOfPurchases) {
        return numberOfPurchases * 10;
    }

    public String determineAccountStatus(int daysSinceLastLogin) {
        if (daysSinceLastLogin > 365) {
            return "INACTIVE";
        } else if (daysSinceLastLogin > 30) {
            return "DORMANT";
        }
        return "ACTIVE";
    }
}
