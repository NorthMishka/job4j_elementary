package ru.job4j;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int posLeft = 0;
        int posRight = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (posLeft != left.length && posRight != right.length) {
                if (left[posLeft] < right[posRight]) {
                    rsl[i] = left[posLeft++];
                } else {
                    rsl[i] = right[posRight++];
                }
            } else if (posLeft == left.length) {
                rsl[i] = right[posRight++];
            } else {
                rsl[i] = left[posLeft++];
            }
        }
        return rsl;
    }
}

