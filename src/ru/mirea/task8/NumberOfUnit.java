package ru.mirea.task8;

import java.util.Scanner;



public class NumberOfUnit {



    public static int NumberOfUnits() {

        Scanner input = new Scanner(System.in);

        int last = input.nextInt();

        if (last == 1) {

            return NumberOfUnits() + 1;

        } else if (last == 0) {

            int next = input.nextInt();

            if (next == 0) {

                return 0;

            } else if (next == 1) {

                return NumberOfUnits() + 1;

            } else return NumberOfUnits();

        } else {

            return NumberOfUnits();

        }

    }



    public static void main(String[] args) {

        System.out.println("Количество единиц в последовательности ввыеденных чисел: " + NumberOfUnits());

    }

}
