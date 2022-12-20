package ru.mirea.task7;

public class ProcessStrings implements Strings {

    public int length(String s) {

        return s.length();

    }



    public String oddPos(String s) {

        char[] c = s.toCharArray();

        StringBuilder result = new StringBuilder();

        for (int i = c.length - 1; i > 0; i--) {

            if ((i + 1) % 2 != 0) {

                result.insert(0, c[i]);

            }

        }

        return c[0] + result.toString();

    }



    @Override

    public String invert(String s) {

        String newString = "";

        for (int i = length(s)-1; i >= 0; i--) {

            newString += s.charAt(i);

        }

        return newString;

    }

}
