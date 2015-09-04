//ImportedUntaxableItem has a price and tax
package com.thoughtworks.baseline3;

import static java.lang.Math.ceil;

public class ImportedUntaxableItem implements TaxableItem {

    private double price;

    public ImportedUntaxableItem(double price) {
        this.price = price;
    }

    @Override
    public double totalTax() {
        return roundOff(0.05 * price);
    }

    private double roundOff(double value) {
        return ceil(value * 20) / 20;
    }
}
