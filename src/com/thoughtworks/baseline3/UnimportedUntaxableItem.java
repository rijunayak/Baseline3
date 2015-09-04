package com.thoughtworks.baseline3;

public class UnimportedUntaxableItem implements TaxableItem {

    private double price;

    public UnimportedUntaxableItem(double price) {
        this.price = price;
    }


    @Override
    public double calculateTotalTax() {
        return 0;
    }
}
