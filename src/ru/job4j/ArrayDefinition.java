package ru.job4j;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        float[] prices = new float[40];
        String[] surnames = new String[100500];
        String[] names = new String[4];
        names[0] = "Pavel Durov";
        names[1] = "Sergey Volkov";
        names[2] = "Konstantin Berezin";
        names[3] = "Ivan Ivanov";

        System.out.println(names[0] + "\n" + names[1] + "\n" + names[2] + "\n" + names[3]);
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);

    }
}
