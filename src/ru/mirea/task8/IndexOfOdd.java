package ru.mirea.task8;

import java.util.Scanner;



public class IndexOfOdd {



    public static void OddIndex() {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n > 0) {

            int m = input.nextInt();

            System.out.println(n);

            if (m > 0) {

                OddIndex();

            }

        }

    }



    public static void main(String[] args) {

        OddIndex();

    }

}
