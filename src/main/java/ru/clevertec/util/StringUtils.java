package ru.clevertec.util;

public class StringUtils {
    public static boolean isPositiveNumber(String number) {
        if (number == null || number.trim().isEmpty()) {
            return false;
        }

        try {
            double num = Double.parseDouble(number.trim());

            return num > 0 && !Double.isInfinite(num);
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
