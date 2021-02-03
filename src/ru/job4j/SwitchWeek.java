package ru.job4j;

public class SwitchWeek {

    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                System.out.println(name);
                break;
            case 2:
                name = "Вторник";
                System.out.println(name);
                break;
            case 3:
                name = "Среда";
                System.out.println(name);
                break;
            case 4:
                name = "Четверг";
                System.out.println(name);
                break;
            case 5:
                name = "Пятница";
                System.out.println(name);
                break;
            case 6:
                name = "Суббота";
                System.out.println(name);
                break;
            case 7:
                name = "Воскресение";
                System.out.println(name);
                break;
            default:
                name = "Ошибка!";
                System.out.println(name);
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        nameOfDay(1);
        nameOfDay(8);
    }
}
