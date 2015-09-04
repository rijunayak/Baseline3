package com.thoughtworks.baseline3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ImportedUntaxableItemTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void shouldCalculateSameMaturedForZeroPricedImportedUntaxableItem() {
        ImportedUntaxableItem importedUntaxableItem = new ImportedUntaxableItem(0.0, 1, "imported chocolates");

        assertEquals(0.0, importedUntaxableItem.maturedPrice(), 0.0);
    }

    @Test
    public void shouldRightlyReturnRoundedOffMaturedOnImportedUntaxableItem() {
        ImportedUntaxableItem importedUntaxableItem = new ImportedUntaxableItem(13.56, 1, "imported chocolates");

        assertEquals(14.25, importedUntaxableItem.maturedPrice(), 0.0);
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
        ImportedUntaxableItem importedUntaxableItem = new ImportedUntaxableItem(13.56, 1, "imported chocolates");

        importedUntaxableItem.display();

        assertEquals("1 imported chocolates: 14.25\n", outContent.toString());
    }
}
