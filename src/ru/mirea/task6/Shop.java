package ru.mirea.task6;

public class Shop implements Printable {

    private String name;

    private int price;



    public Shop(String name, int price) {

        this.name = name;

        this.price = price;

    }

    public String getName() {

        return name;

    }

    public int getPrice() {

        return price;

    }

    @Override

    public void print() {

        System.out.println("Shop {name=" + name + ", price=" + price + "}");

    }

}
