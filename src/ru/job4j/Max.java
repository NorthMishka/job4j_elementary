package ru.job4j;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }
    public static int max(int left, int up, int right) {
        return  max(max(left, right), up);
    }
    public static int max(int left, int up, int right, int down) {
        return max(max(left, up, right), down);
    }
}
