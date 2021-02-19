package ru.job4j;

public class Max {

//    public static int max(int left, int right) {
//        return left >= right ? left : right;
//    }
    public static  int max(int a, int b){
        return a + b;
    }
    public static  int max(int a, int b, int c){
        return a + max(b, c);
    }
    public static int max(int a, int b, int c, int d){
        return a + max(b, c, d);
    }
//
//    public static void main(String[] args) {
//        max(12, 11);
//
//    }
}
