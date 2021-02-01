package ru.job4j;

public class SqArea {
    public static double square(int p, int k) {
        double s, l, h;
        h = p / (2 * (k + 1));
        l = h * k;
        s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = " + result1);
    }
}
