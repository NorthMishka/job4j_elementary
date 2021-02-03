package ru.job4j;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = 0;
        if (first > second) {
            result = first;
        } else result = second;
        if (third > result) {
            result = third;
        }
        System.out.println(result);
        return result;
    }

}
