package ru.mirea.task3;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        System.out.println("Массив с помощью math.random():");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Сортировка:");
        System.out.println(Arrays.toString(array));

        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt() % 10;
        }

        System.out.println("Массив с классом Random:");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Сортировка:");
        System.out.println(Arrays.toString(array));
    }
}
