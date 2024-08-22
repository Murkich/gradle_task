package ru.clevertec;

import ru.clevertec.util.Utils;

public class App {
    public static void main(String[] args) {
        boolean result = Utils.isAllPositiveNumbers("12", "79");
        System.out.println("Are all numbers positive? " + result);
    }
}