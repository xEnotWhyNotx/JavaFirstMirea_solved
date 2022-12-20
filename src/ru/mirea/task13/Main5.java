package ru.mirea.task13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main5 {
    public static void main(String[] args) {
        String number = "+79991233213";
        String number1 = "+108005553535";
        String number2 = "89381673442";
        String number3 = "+1234569693495";
        String number4 = "93413452345";
        System.out.println(NumberFormatter.getNumber(number));
        System.out.println(NumberFormatter.getNumber(number1));
        System.out.println(NumberFormatter.getNumber(number2));
        System.out.println(NumberFormatter.getNumber(number3));
        System.out.println(NumberFormatter.getNumber(number4));
    }
}

class NumberFormatter {
    public static String getNumber(String value) {
        Pattern pattern = Pattern.compile("(\\+[0-9]{1,3}|8)([0-9]{3})([0-9]{3})([0-9]{4})");
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches()) {
            String countryCode = matcher.group(1);
            if (countryCode.startsWith("8"))
                countryCode = "+7";
            return String.format("%s%s-%s-%s", countryCode, matcher.group(2),
                    matcher.group(3), matcher.group(4));
        }
        else
            return "Not a valid number";
    }
}