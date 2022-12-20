package ru.mirea.task8;

import java.util.Scanner;



public class RecursionReverse {



    public static int Reverse(int n, int temp) {

        if (n == 0) {

            return temp;

        } else {

            return Reverse(n / 10, 10 * temp + n % 10);

        }

    }





    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите число:");

        int n = input.nextInt();

        System.out.println(Reverse(n, 0));

    }

}