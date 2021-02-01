package ru.job4j;

//1 доллар = 60 рублей
//1 евро = 70 рублей
public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int inEuro = 140;
        int inDollar = 140;
        int expectedEuro = 2;
        int expectedDollar = 2;
        int outEuro = Converter.rubleToEuro(inEuro);
        int outDollar = Converter.rubleToDollar(inDollar);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;

        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");

        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        System.out.println("140 rubles are 2. Test result : " + passedDollar);
    }
}
