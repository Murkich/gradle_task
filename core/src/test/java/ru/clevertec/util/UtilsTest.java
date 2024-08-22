package ru.clevertec.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UtilsTest {
    @Test
    void testIsAllPositiveNumbers() {
        assertTrue(Utils.isAllPositiveNumbers("12", "79"));
        assertFalse(Utils.isAllPositiveNumbers("12", "-79"));
        assertFalse(Utils.isAllPositiveNumbers("12", "abc"));
        assertTrue(Utils.isAllPositiveNumbers("12", "13", "2.0"));
        assertTrue(Utils.isAllPositiveNumbers("12", "13", "2.0", "122794"));
        assertFalse(Utils.isAllPositiveNumbers("126", "984", null));
        assertFalse(Utils.isAllPositiveNumbers("483", "205", ""));
        assertFalse(Utils.isAllPositiveNumbers("483", "205", "  "));
        assertFalse(Utils.isAllPositiveNumbers("483", "205", "183j"));
        assertTrue(Utils.isAllPositiveNumbers("17.34", "95.032", "2.0"));
        assertFalse(Utils.isAllPositiveNumbers("17.34", "95.032", "0.0"));
        assertTrue(Utils.isAllPositiveNumbers("17.34", "95.032", "0.06"));
        assertFalse(Utils.isAllPositiveNumbers("17.34", "95.032", "19.0", "0"));
    }
}