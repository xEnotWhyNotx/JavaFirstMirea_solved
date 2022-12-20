package ru.mirea.task2.task4;


import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> computers = new ArrayList<Computer>();

    public Computer findComputer(String name) {
        for (Computer c : computers) {
            if (c.getName().compareTo(name) == 0)
                return c;
        }
        return null;
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer c) {
        computers.remove(c);
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addComputer(new Computer("Asus"));
        shop.addComputer(new Computer("Lenovo"));
        shop.addComputer(new Computer("HP"));
        System.out.println(shop.findComputer("Lenovo"));
        shop.removeComputer(shop.findComputer("HP"));
        Computer tmp = shop.findComputer("HP");
        if (tmp == null)
            System.out.println("No such computer");
        else
            System.out.println("You found " + tmp);
    }
}
