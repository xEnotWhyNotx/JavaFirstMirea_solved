package ru.mirea.task8;


import java.util.Scanner;



public class OddNumbers {



    public static void Odd() {

        Scanner input = new Scanner(System.in);

        int last = input.nextInt();

        if (last != 0) {

            if (last % 2 == 1) {

                System.out.print(last  + " ");

            }

            Odd();

        }



    }



    public static void main(String[] args) {

        Odd();

    }

}
