package ru.mirea.task1;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] expenses = new int[10];
        int s = 0;

        System.out.print("Введите 10 цифры\n");
        for (int i=0;i < expenses.length;i++) {
            expenses[i] = sc.nextInt();
        }
        int min = expenses[0];
        int max = expenses[0];
        System.out.print("Введите 10 цифры\n");
        int i = 0;
        while (i < (expenses.length-1)) {
            i += 1;
            s += expenses[i];
            if (min >expenses[i]){
                min=expenses[i];
            }
            if (max < expenses[i]){
                max=expenses[i];
            }
        }

        System.out.println("Сумма элементов = " + s);
        System.out.println("Минимум " + min);
        System.out.println("Максимум " + max);
    }
}
