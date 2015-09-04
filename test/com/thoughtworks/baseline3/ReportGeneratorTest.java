package com.thoughtworks.baseline3;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ReportGeneratorTest {

    @Test
    public void firstTokenMustBeInteger() {
        ReportGenerator reportGenerator = new ReportGenerator();

        assertFalse(reportGenerator.parseInput("gray box of chocolates at 5.0"));
    }

    @Test
    public void lastTokenMustBeDouble() {
        ReportGenerator reportGenerator = new ReportGenerator();

        assertFalse(reportGenerator.parseInput("1 box of chocolates at free"));
    }
}
