package ru.mirea.task6;


public class Convert implements Convertable{

    public double convertK(int n)

    {

        return n+273.15;

    }

    public double convertF(int n)

    {

        return n*1.8+32;

    }

}
