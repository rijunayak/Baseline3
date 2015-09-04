package com.thoughtworks.baseline3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnimportedUntaxableItemTest {

    @Test
    public void UnimportedUntaxableItemShouldAlwaysHaveSameMaturedPriceAsPrice() {
        UnimportedUntaxableItem unimportedUntaxableItem = new UnimportedUntaxableItem(6.0);

        assertEquals(0.0, unimportedUntaxableItem.maturedPrice(), 0.0);
    }
}
