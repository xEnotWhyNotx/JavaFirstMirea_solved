package ru.mirea.task9;

import java.util.Scanner;



public class TestStudent {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Сколько студентов?");

        int n=scanner.nextInt();

        StudentClass testClass=new StudentClass(n);

        testClass.sort_id();

        testClass.out_id();

    }

}
