package ru.job4j;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, 0, data.length - 1);
            int index = FindLoop.indexOf(data, min, 0, data.length - 1);
            /* swap(...) */
            for (int j = 0; j < data.length; j++) {
                if (data[i] < data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        return data;
    }
}
