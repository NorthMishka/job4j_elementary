package ru.job4j;

public class Factorial {
    public static int calc(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }

}

