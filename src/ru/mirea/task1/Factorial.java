package ru.mirea.task1;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Факториал какого числа?");
        n = sc.nextInt();
        int res=factorial(n);
        System.out.print(n +"! = "+res);
    }

    public static int factorial(int n){
        int f=1;
        while (n!=1)
        {
            f=f*n;
            n=n-1;
        }
        return(f);
    }
}
