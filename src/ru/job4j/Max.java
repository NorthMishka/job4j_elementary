package ru.job4j;

public class Max {

    public static int max(int left, int right) {
        boolean condition = left >= right;
        int result = condition ? left : right;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        max(10, 11);

    }
}
