package ru.job4j;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        int year = 2021;
        String space = " ";
        String ideaPlusYear = idea + year;
        String ideaPlusSpacePlusYear = idea + space + year;

        System.out.println(idea);
        System.out.println(idea + " But I am a newbie.");
        System.out.println(ideaPlusYear);
        System.out.println(ideaPlusSpacePlusYear);
    }
}
