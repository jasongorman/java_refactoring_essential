package com.codemanship.refactoring.legacycode;

import java.io.IOException;

public class ShippingCalculator {

    private final FetchOrder fetchOrder;

    public ShippingCalculator(FetchOrder fetchOrder) {
        this.fetchOrder = fetchOrder;
    }

    public double calculateShipping(int orderId) {

        try {
            Order order = fetchOrder.fetchOrder(orderId);

            switch (order.getShippingType()) {

                case "STANDARD":
                    return order.getWeightKg() * 0.5;

                case "EXPRESS":
                    return order.getWeightKg() * 0.8
                            + order.getDistanceKm() * 0.1;

                case "OVERNIGHT":
                    return order.getWeightKg() * 1.2 + 25;

                default:
                    throw new RuntimeException(
                            "Unknown shipping type: "
                                    + order.getShippingType()
                    );
            }

        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }

    private Order fetchOrder(int orderId) throws IOException, InterruptedException {

        return fetchOrder.fetchOrder(orderId);
    }
}
