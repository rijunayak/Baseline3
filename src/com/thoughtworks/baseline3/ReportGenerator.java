//Takes an input Stream and prints the report
package com.thoughtworks.baseline3;

import java.util.ArrayList;
import java.util.Arrays;

public class ReportGenerator {

    private ArrayList<TaxableItem> items = new ArrayList<TaxableItem>();
    private ArrayList<String> untaxableItems = new ArrayList<String>(Arrays.asList("book", "chocolate", "headache pills"));

    public boolean parseInput(String input) {
        String tokenizedCommands[] = input.split(" ");
        int quantity;
        if(!isInteger(tokenizedCommands[0]))
            return false;
        quantity = Integer.parseInt(tokenizedCommands[0]);
        StringBuilder itemName;
        double price;
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
}
