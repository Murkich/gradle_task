package ru.clevertec.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    void testIsPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("5"));
        assertTrue(StringUtils.isPositiveNumber("3.14"));
        assertFalse(StringUtils.isPositiveNumber("0"));
        assertFalse(StringUtils.isPositiveNumber("-1"));
        assertTrue(StringUtils.isPositiveNumber("2.0"));
        assertFalse(StringUtils.isPositiveNumber("0"));
        assertFalse(StringUtils.isPositiveNumber("0.0"));
        assertFalse(StringUtils.isPositiveNumber(null));
        assertFalse(StringUtils.isPositiveNumber(""));
        assertFalse(StringUtils.isPositiveNumber("  "));
        assertFalse(StringUtils.isPositiveNumber("abc"));
        assertTrue(StringUtils.isPositiveNumber("1e5"));
    }
}