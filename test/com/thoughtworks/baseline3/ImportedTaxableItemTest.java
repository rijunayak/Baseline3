package com.thoughtworks.baseline3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImportedTaxableItemTest {

    @Test
    public void shouldReturnZeroTaxForZeroPricedImportedTaxableItem() {
        ImportedTaxableItem importedTaxableItem = new ImportedTaxableItem(0.0);

        assertEquals(0.0, importedTaxableItem.totalTax(), 0.0);
    }

    @Test
    public void shouldRightlyReturnRoundedOffTaxForImportedTaxableItem() {
        ImportedTaxableItem importedTaxableItem = new ImportedTaxableItem(13.46);

        assertEquals(2.05, importedTaxableItem.totalTax(), 0.0);
    }
}
