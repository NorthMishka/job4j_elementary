package ru.job4j;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
