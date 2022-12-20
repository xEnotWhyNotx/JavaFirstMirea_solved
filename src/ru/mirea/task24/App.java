package ru.mirea.task24;

public class App {
    public static void main(String[] args) {
        // Factory
        FactoryChairs myFactory = new FactoryChairs();
        // Chairs
        Chair victorian = myFactory.createChair(ChairType.VICTORIAN, "Синий", 11);
        Chair multifunctional = myFactory.createChair(ChairType.MULTIFUNCTIONAL, "Зелёный", 13);
        Chair magic = myFactory.createChair(ChairType.MAGIC, "Белый", 14);
        // Client
        Client client = new Client("Алексей", 34);
        client.sit(multifunctional);
        client.sit(magic);
        client.sit(victorian);
    }
}