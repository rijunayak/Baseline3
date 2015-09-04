package com.thoughtworks.baseline3;

public class ImportedUntaxableItem implements TaxableItem {

    private double price;

    public ImportedUntaxableItem(double price) {
        this.price = price;
    }

    @Override
    public double calculateTotalTax() {
        return 0;
    }
}
