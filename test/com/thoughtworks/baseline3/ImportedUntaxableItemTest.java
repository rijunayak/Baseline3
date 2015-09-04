package com.thoughtworks.baseline3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImportedUntaxableItemTest {

    @Test
    public void shouldCalculateZeroTaxForZeroPricedImportedUntaxableItem() {
        ImportedUntaxableItem importedUntaxableItem = new ImportedUntaxableItem(0.0);

        assertEquals(0.0, importedUntaxableItem.calculateTotalTax(), 0.0);
    }

    @Test
    public void shouldRightlyReturnRoundedOffTaxOnImportedUntaxableItem() {
        ImportedUntaxableItem importedUntaxableItem = new ImportedUntaxableItem(13.56);

        assertEquals(0.7, importedUntaxableItem.calculateTotalTax(), 0.0);
    }
}
