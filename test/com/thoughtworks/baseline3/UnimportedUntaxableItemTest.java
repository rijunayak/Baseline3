package com.thoughtworks.baseline3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class UnimportedUntaxableItemTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void UnimportedUntaxableItemShouldAlwaysHaveSameMaturedPriceAsPrice() {
        UnimportedUntaxableItem unimportedUntaxableItem = new UnimportedUntaxableItem(6.0, 1, "chocolate");

        assertEquals(6.0, unimportedUntaxableItem.maturedPrice(), 0.0);
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
        UnimportedUntaxableItem unimportedUntaxableItem = new UnimportedUntaxableItem(6.0, 1, "chocolate");

        unimportedUntaxableItem.display();

        assertEquals("1 chocolate: 6.0\n", outContent.toString());
    }
}
