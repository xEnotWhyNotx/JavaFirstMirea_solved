package ru.mirea.task8;

import java.util.Scanner;



public class LeftRight {



    public static void Number(Integer n) {

        if (n != 0) {

            Number(n / 10);

            System.out.print(n % 10 + " ");

        }

    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n > 0) {

            Number(n);

        } else {

            System.out.println("Программа обрабатывает только натуральные числа(1,2,3,...).");

        }



    }

}
