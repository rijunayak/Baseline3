package com.thoughtworks.baseline3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class UnimportedTaxableItemTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void shouldReturnSameMaturedPriceOnAZeroPricedUnimportedTaxableItem() {
        UnimportedTaxableItem unimportedTaxableItem = new UnimportedTaxableItem(0.0, 1, "perfume");

        assertEquals(0.0, unimportedTaxableItem.maturedPrice(),0.0);
    }

    @Test
    public void shouldRightlyReturnRoundedMaturedPriceForUnimportedTaxableItem() {
        UnimportedTaxableItem unimportedTaxableItem = new UnimportedTaxableItem(13.46, 1, "perfume");

        assertEquals(14.85, unimportedTaxableItem.maturedPrice(), 0.0);
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }

    @Test
    public void shoudlRightlyDisplayItem() {
        UnimportedTaxableItem unimportedTaxableItem = new UnimportedTaxableItem(13.46, 1, "perfume");

        unimportedTaxableItem.display();

        assertEquals("1 perfume: 14.85\n", outContent.toString());
    }
}
