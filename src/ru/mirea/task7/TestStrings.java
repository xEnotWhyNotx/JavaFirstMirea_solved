package ru.mirea.task7;

public class TestStrings {

    public static void main(String[] args) {

        Strings strings = new ProcessStrings();

        String s = "Hello World!";

        System.out.println(strings.length(s));

        System.out.println(strings.oddPos(s));

        System.out.println(strings.invert(s));

    }

}