//An Imported Taxable Problem has a price, maturedPrice and displays itself
package com.thoughtworks.baseline3;

import static java.lang.Math.ceil;

public class ImportedTaxableItem implements TaxableItem {

    private int quantity;
    private double price;
    private String itemName;

    public ImportedTaxableItem(double price, int quantity, String itemName) {
        this.quantity = quantity;
        this.itemName = itemName;
        this.price = price;
    }

    @Override
    public double maturedPrice() {
        return roundOff(price + 0.15 * quantity * price);
    }

    @Override
    public void display() {
        System.out.println(quantity + " " + itemName + ": " + maturedPrice());
    }

    private double roundOff(double value) {
        return ceil(value * 20) / 20;
    }
}
