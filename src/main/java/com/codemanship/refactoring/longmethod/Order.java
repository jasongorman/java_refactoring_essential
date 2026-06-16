package com.codemanship.refactoring.longmethod;

import java.util.List;

public class Order {

    private final List<OrderItem> items;
    private final Customer customer;

    public Order(List<OrderItem> items, Customer customer) {
        this.items = items;
        this.customer = customer;
    }

    public OrderSummary summarise() {

        // Validation
        validateItems();

        // Subtotal calculation
        double subtotal = calculateSubtotal();

        // Discount rules
        double discount = calculateDiscount(subtotal);

        // Tax calculation
        double taxableAmount = subtotal - discount;
        double tax = taxableAmount * 0.20;

        // Total calculation
        double total = taxableAmount + tax;

        return new OrderSummary(subtotal, discount, tax, total);
    }

    private double calculateDiscount(double subtotal) {
        double discount = 0.0;
        if (customer.isLoyal()) {
            discount = subtotal * 0.10;
        } else if (subtotal > 100) {
            discount = subtotal * 0.05;
        }
        return discount;
    }

    private double calculateSubtotal() {
        double subtotal = 0.0;
        for (OrderItem item : items) {
            subtotal += item.getPrice() * item.getQuantity();
        }
        return subtotal;
    }

    private void validateItems() {
        if (items == null) {
            throw new IllegalStateException("Items cannot be null");
        }
        if (items.isEmpty()) {
            throw new IllegalStateException("Order must contain items");
        }
    }
}
