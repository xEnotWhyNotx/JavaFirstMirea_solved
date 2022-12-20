package ru.mirea.task1;
import java.util.Scanner;

public class Summa {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] expenses = new int[10];
        int s=0;

        System.out.print("Введите 10 цифры\n");
        for (int i=0;i < expenses.length;i++) {
            expenses[i] = sc.nextInt();
            s+=expenses[i];
        }

        System.out.println("Сумма элементов = "+ s);
        int c = s/(expenses.length);
        System.out.print("Среднее арифметическое = " + c);
    }
}
