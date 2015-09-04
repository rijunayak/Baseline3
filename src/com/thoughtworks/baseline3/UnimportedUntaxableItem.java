//An UnimportedUntaxable Item has a price, matured price and displays itself
package com.thoughtworks.baseline3;

public class UnimportedUntaxableItem implements TaxableItem {

    private int quantity;
    private double price;
    private String itemName;

    public UnimportedUntaxableItem(double price, int quantity, String itemName) {
        this.quantity = quantity;
        this.price = price;
        this.itemName = itemName;
    }


    @Override
    public double maturedPrice() {
        return price;
    }

    @Override
    public void display() {
        System.out.println(quantity + " " + itemName + ": " + maturedPrice());
    }
}
