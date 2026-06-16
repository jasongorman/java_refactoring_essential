package com.codemanship.refactoring.legacycode;

public class ShippingApp {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java ShippingApp <orderId>");
            return;
        }

        int orderId = Integer.parseInt(args[0]);

        ShippingCalculator calculator = new ShippingCalculator(new FetchOrderFromEndpoint());

        try {
            double cost = calculator.calculateShipping(orderId);

            System.out.println("Order ID: " + orderId);
            System.out.println("Shipping cost: " + cost);

        } catch (Exception e) {
            System.out.println("Failed to calculate shipping for order " + orderId);
            e.printStackTrace();
        }
    }
}
