package ru.job4j;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }
    public static int max(int left, int up, int right) {
        return up >= max(left, right) ? up : max(left, right);
    }
    public static int max(int left, int up, int right, int down) {
        return down >= max(left, up, right) ? down : max(left, up, right);
    }
}
