package ru.job4j;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if ((number % i) == 0) {
                    prime = false;
                    break;
                } else prime = true;
            }
        }
        return prime;
    }
}