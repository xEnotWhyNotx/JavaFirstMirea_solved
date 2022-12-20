package ru.mirea.task2.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введенных слов с клавиатуры: " + sc.nextLine().split(" ").length);
    }
}