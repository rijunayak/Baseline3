//An Imported Taxable Problem has a price and tax
package com.thoughtworks.baseline3;

import static java.lang.Math.ceil;

public class ImportedTaxableItem implements TaxableItem {

    private double price;

    public ImportedTaxableItem(double price) {
        this.price = price;
    }

    @Override
    public double totalTax() {
        return roundOff(0.15 * price);
    }

    private double roundOff(double value) {
        return ceil(value * 20) / 20;
    }
}
