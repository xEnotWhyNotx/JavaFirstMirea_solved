package ru.mirea.task6;

import java.util.ArrayList;

import java.util.List;



public class TestPrintable {

    public static void main(String[] args) {

        List<Printable> list= new ArrayList<>();

        list.add(new Book("To Kill a Mockingbird", "Harper Lee"));

        list.add(new Book("Harry Potter", "Joan Rowling"));

        list.add(new Shop("Jeans", 2500));

        list.add(new Shop("Sweater", 1300));



        for (var p : list) {

            p.print();

        }

    }

}