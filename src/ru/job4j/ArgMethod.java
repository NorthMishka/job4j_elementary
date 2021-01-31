package ru.job4j;

public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, i'am " + name);
    }

    public static void age(int age){
        System.out.println("and i'am " + age);
    }

    public static void nameAndAge(String name, int age){
        System.out.println("Hello, i'am " + name + " and i'am " + age);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello(name);
        ArgMethod.hello(name);
        ArgMethod.hello(name);
        ArgMethod.hello(name);

        ArgMethod.age(age);

        ArgMethod.nameAndAge(name, age);
    }
}