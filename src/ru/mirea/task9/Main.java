package ru.mirea.task9;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Сколько студентов?");

        int n=scanner.nextInt();

        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA(n);

        System.out.println("каким методом сортировки хотите воспользоваться?\n\t1\t- Сортировка слиянием\n\t2\t- Быстрая сортировка");

        if(scanner.nextInt()==1) sortingStudentsByGPA.sortGpaMerge();

        else sortingStudentsByGPA.sortGpaQuick();

        sortingStudentsByGPA.out_students();

    }

}