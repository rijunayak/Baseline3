//Takes an input Stream and prints the report
package com.thoughtworks.baseline3;

import java.util.ArrayList;
import java.util.Arrays;

public class ReportGenerator {

    private ArrayList<TaxableItem> items = new ArrayList<TaxableItem>();

    public boolean parseInput(String input) {
        String tokenizedCommands[] = input.split(" ");
        int quantity;
        if(!isInteger(tokenizedCommands[0]))
            return false;
        quantity = Integer.parseInt(tokenizedCommands[0]);
        double price;
        if(!isDouble(tokenizedCommands[tokenizedCommands.length - 1]))
            return false;
        price = Double.parseDouble(tokenizedCommands[tokenizedCommands.length - 1]);
        String itemName;
        StringBuilder itemNameBuilder = new StringBuilder();
        for(int i = 1; i <= tokenizedCommands.length - 3; i++) {
            itemNameBuilder.append(tokenizedCommands[i]);
            if (i != tokenizedCommands.length - 3)
                itemNameBuilder.append(" ");
        }
        itemName = itemNameBuilder.toString();
        if(itemName.contains("book") || itemName.contains("chocolate") || itemName.contains("headache pills")) {
            if(itemName.contains("imported")) {
                ImportedUntaxableItem importedUntaxableItem = new ImportedUntaxableItem(price, quantity, itemName);
                items.add(importedUntaxableItem);
            } else {
                UnimportedUntaxableItem unimportedUntaxableItem = new UnimportedUntaxableItem(price, quantity, itemName);
                items.add(unimportedUntaxableItem);
            }
        } else {
            if(itemName.contains("imported")) {
                ImportedTaxableItem importedTaxableItem = new ImportedTaxableItem(price, quantity, itemName);
                items.add(importedTaxableItem);
            } else {
                UnimportedTaxableItem unimportedTaxableItem = new UnimportedTaxableItem(price, quantity, itemName);
                items.add(unimportedTaxableItem);
            }
        }
        return true;
    }

    private boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

    private boolean isDouble(String value) {
        try {
            Double.parseDouble(value);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
}
