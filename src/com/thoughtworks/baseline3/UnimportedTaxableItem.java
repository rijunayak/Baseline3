//An Unimported Taxable Item has a price, matured price and displays itself
package com.thoughtworks.baseline3;

import org.junit.Test;

import static java.lang.Math.ceil;

public class UnimportedTaxableItem implements TaxableItem {

    private int quantity;
    private double price;
    private String itemName;

    public UnimportedTaxableItem(double price) {
        this.quantity = quantity;
        this.price = price;
        this.itemName = itemName;
    }

    @Override
    public double maturedPrice() {
        return roundOff(0.1 * quantity * price);
    }

    @Override
    public void display() {

    }

    private double roundOff(double value) {
        return ceil(value * 20) / 20;
    }
}
