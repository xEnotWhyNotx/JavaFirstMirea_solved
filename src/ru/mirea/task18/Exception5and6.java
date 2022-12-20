package ru.mirea.task18;

public class Exception5and6 {
    public static void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public static String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key;
    }
    public static void main(String[] args) {
        try{
            printMessage("key");
        } catch (NullPointerException e){
            System.out.println( "Ошибка!" );
        };
    }
}
