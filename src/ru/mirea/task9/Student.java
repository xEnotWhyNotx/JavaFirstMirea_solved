package ru.mirea.task9;

import java.util.Comparator;

import java.util.Objects;

import java.util.Scanner;



public class Student {

    int id;

    double gpa;

    String name;

    public Student(int id, double gpa, String name) {

        this.id = id;

        this.gpa = gpa;

        this.name = name;

    }



    public Student() {

    }



    public int getId() {

        return id;

    }



    public double getGpa() {

        return gpa;

    }



    public String getName() {

        return name;

    }



}