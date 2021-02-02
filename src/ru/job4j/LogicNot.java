package ru.job4j;

public class LogicNot {
    //проверяет, что число четное
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    //проверяет, что число положительное
    public boolean isPositive(int num) {
        return num > 0;
    }

    //проверяет, что число нечетное
    public boolean notEven(int num) {
        return !isEven(num);
    }

    //проверяет, что число не положительное
    public boolean notPositive(int num) {
        return !isPositive(num);
    }

    //проверяет, что число нечетное И положительное
    public boolean notEvenAndPositive(int num) {
        return !isEven(num) && num > 0;
    }

    //проверяет, что число четное ИЛИ не положительное
    public boolean evenOrNotPositive(int num) {
        return num % 2 == 0 || !isPositive(num);
    }

}
