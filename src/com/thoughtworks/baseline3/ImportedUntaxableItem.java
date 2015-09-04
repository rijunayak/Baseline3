//ImportedUntaxableItem has a price, matured Price and displays itself
package com.thoughtworks.baseline3;

import static java.lang.Math.ceil;

public class ImportedUntaxableItem implements TaxableItem {

    private int quantity;
    private double price;
    private String itemName;

    public ImportedUntaxableItem(double price, int quantity, String itemName) {
        this.quantity = quantity;
        this.price = price;
        this.itemName = itemName;
    }

    @Override
    public double maturedPrice() {
        return roundOff(price + 0.05 * quantity * price);
    }

    @Override
    public void display() {
        System.out.println(quantity + " " + itemName + ": " + maturedPrice());
    }

    private double roundOff(double value) {
        return ceil(value * 20) / 20;
    }
}
