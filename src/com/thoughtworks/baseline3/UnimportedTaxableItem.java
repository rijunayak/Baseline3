//An Unimported Taxable Item has a price, matured price and displays itself
package com.thoughtworks.baseline3;

import static java.lang.Math.ceil;

public class UnimportedTaxableItem implements TaxableItem {

    private int quantity;
    private double price;
    private String itemName;

    public UnimportedTaxableItem(double price, int quantity, String itemName) {
        this.quantity = quantity;
        this.price = price;
        this.itemName = itemName;
    }

    @Override
    public double maturedPrice() {
        return roundOff(price + 0.1 * quantity * price);
    }

    @Override
    public void display() {
        System.out.println(quantity + " " + itemName + ": " + maturedPrice());
    }

    private double roundOff(double value) {
        return ceil(value * 20) / 20;
    }
}
