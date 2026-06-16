package com.codemanship.refactoring.featureenvy;

class Product {
    private final double price;
    private final boolean onSale;

    public Product(double price, boolean onSale) {
        this.price = price;
        this.onSale = onSale;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public double calculateFinalPrice() {
        double price = getPrice();

        if (isOnSale()) {
            price = price * 0.8;
        }

        return price;
    }
}
