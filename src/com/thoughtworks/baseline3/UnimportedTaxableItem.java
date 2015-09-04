//An Unimported Taxable Item has a price and tax
package com.thoughtworks.baseline3;

import org.junit.Test;

import static java.lang.Math.ceil;

public class UnimportedTaxableItem implements TaxableItem {

    private double price;

    public UnimportedTaxableItem(double price) {
        this.price = price;
    }

    @Override
    public double totalTax() {
        return roundOff(0);
    }

    private double roundOff(double value) {
        return ceil(value * 20) / 20;
    }
}
