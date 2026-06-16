package com.codemanship.refactoring.featureenvy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceCalculatorTest {

    private final PriceCalculator calculator = new PriceCalculator();

    @Test
    void shouldApplyDiscountWhenProductIsOnSale() {
        Product product = new Product(100.0, true);

        double result = product.calculateFinalPrice();

        assertEquals(80.0, result);
    }

    @Test
    void shouldNotApplyDiscountWhenProductIsNotOnSale() {
        Product product = new Product(100.0, false);

        double result = product.calculateFinalPrice();

        assertEquals(100.0, result);
    }

    @Test
    void shouldReturnZeroWhenPriceIsZeroEvenIfOnSale() {
        Product product = new Product(0.0, true);

        double result = product.calculateFinalPrice();

        assertEquals(0.0, result);
    }
}