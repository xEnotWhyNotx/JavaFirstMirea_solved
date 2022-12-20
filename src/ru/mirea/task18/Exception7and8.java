package ru.mirea.task18;

import java.util.Scanner;

public class Exception7and8 {
    public static void getKey() {
        Scanner myScanner = new Scanner( System.in);
        String key = myScanner.next();
        try {
            printDetails( key );
        }catch (Exception e){
            System.out.println( "Ошибка! Введите значение повторно! :" );
            String kay = myScanner.next();
            printDetails( kay );
        }

    }
    public static void printDetails(String key) {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private static String getDetails(String key) {
        if(key == "") {
            try {
                System.out.println( "Key set to empty string" );
            } catch (Exception e) {
                System.out.println("Wrong input!");;
            }
        }
        return "data for " + key;
    }
    public static void main(String[] args){
        getKey();
    }

}
