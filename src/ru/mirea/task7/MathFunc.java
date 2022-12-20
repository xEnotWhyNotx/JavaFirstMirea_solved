package ru.mirea.task7;


public class MathFunc implements MathCalculable{

    public double Circ(double radius) {

        return 2*pi*radius;

    }

    public int Pow(int x, int y) {

        int p, i;

        p = 1;

        for (i=1; i<=y; i++)

            p=p*x;

        return p;

    }

    public double Abs(double real, double imag) {

        double abs;

        abs = Math.sqrt(real*real+imag*imag);

        return abs;

    }

}
