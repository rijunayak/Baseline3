package com.thoughtworks.baseline3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ImportedTaxableItemTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void shouldReturnSameMaturedPriceForZeroPricedImportedTaxableItem() {
        ImportedTaxableItem importedTaxableItem = new ImportedTaxableItem(0.0, 1, "imported perfume");

        assertEquals(0.0, importedTaxableItem.maturedPrice(), 0.0);
    }

    @Test
    public void shouldRightlyReturnRoundedOffMaturedPriceForImportedTaxableItem() {
        ImportedTaxableItem importedTaxableItem = new ImportedTaxableItem(13.46, 1, "imported perfume");

        assertEquals(15.5, importedTaxableItem.maturedPrice(), 0.0);
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
        ImportedTaxableItem importedTaxableItem = new ImportedTaxableItem(13.46, 1, "imported perfume");

        importedTaxableItem.display();

        assertEquals("1 imported perfume: 15.5\n", outContent.toString());
    }
}
