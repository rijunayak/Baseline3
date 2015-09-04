package com.thoughtworks.baseline3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImportedUntaxableItemTest {

    @Test
    public void shouldCalculateZeroTaxForZeroPricedImportedUntaxableItem() {
        ImportedUntaxableItem importedUntaxableItem = new ImportedUntaxableItem(0.0);

        assertEquals(0.0, importedUntaxableItem.calculateTotalTax(), 0.0);
    }
}
