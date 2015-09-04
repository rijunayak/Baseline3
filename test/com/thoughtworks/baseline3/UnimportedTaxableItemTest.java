package com.thoughtworks.baseline3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnimportedTaxableItemTest {

    @Test
    public void shouldReturnZeroTaxOnAZeroPricedUnimportedTaxableItem() {
        UnimportedTaxableItem unimportedTaxableItem = new UnimportedTaxableItem(0.0);

        assertEquals(0.0, unimportedTaxableItem.totalTax(),0.0);
    }
}