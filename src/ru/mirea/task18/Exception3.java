package ru.mirea.task18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) throws IOException {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        try{
            System.out.println( 2/i );
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\prizm\\Desktop\\NotThisFile.txt"));
            String firstString = reader.readLine();
            System.out.println(firstString);
        }
        catch (FileNotFoundException e) {

            System.out.println("Ошибка! Файл не найден!");

        }
        catch (ArithmeticException e){
            System.out.println("Attempted division by zero");
        }

    }
}
