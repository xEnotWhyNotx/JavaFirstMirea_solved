package ru.mirea.task7;

public class TestMath {

    public static void main(String[] args) {

        MathCalculable mc1 = new MathFunc();

        MathCalculable mc2 = new MathFunc();

        MathCalculable mc3 = new MathFunc();

        MathCalculable mc4 = new MathFunc();

        int d;

        double x, pi, c;

        d = mc1.Pow(2, 3);

        x = mc2.Abs(5, 4);

        pi = mc3.pi;

        c = mc4.Circ(5);

        System.out.println("Возведение в степень: " + d + " Модуль комплексного числа: " + x + " Число Пи: " + pi + " Длина окружности: " + c);



    }

}
