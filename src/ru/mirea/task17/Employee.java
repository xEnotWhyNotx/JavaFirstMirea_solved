package ru.mirea.task17;

public class Employee
{
    String name;
    int kol;

    public int getkol() {
        return kol;
    }

    public void setkol(int kol) {
        this.kol = kol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}