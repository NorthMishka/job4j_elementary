package ru.job4j;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; ++i, --j) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        return array;
    }
}
