package com.thoughtworks.baseline3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImportedUntaxableItemTest {

    @Test
    public void shouldCalculateSameMaturedForZeroPricedImportedUntaxableItem() {
        ImportedUntaxableItem importedUntaxableItem = new ImportedUntaxableItem(0.0);

        assertEquals(0.0, importedUntaxableItem.maturedPrice(), 0.0);
    }

    @Test
    public void shouldRightlyReturnRoundedOffMaturedOnImportedUntaxableItem() {
        ImportedUntaxableItem importedUntaxableItem = new ImportedUntaxableItem(13.56);

        assertEquals(0.7, importedUntaxableItem.maturedPrice(), 0.0);
    }
}
