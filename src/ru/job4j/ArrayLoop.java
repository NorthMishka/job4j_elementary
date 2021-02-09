package ru.job4j;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println("for:");
        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = i * 2 + 3;
            System.out.println(numbers[i] = i * 2 + 3);
        }
        System.out.println("\n" + "for-each:");
        for (int number : numbers) {
            System.out.println(number);

        }
    }
}
