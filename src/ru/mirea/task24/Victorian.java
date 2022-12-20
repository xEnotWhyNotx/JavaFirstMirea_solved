package ru.mirea.task24;

public class Victorian implements Chair {
    private String color;
    private int size;
    Victorian(String c, int s) {
        color = c;
        size = s;
    }
    public void specialCharacteristic() {
        System.out.println("Я Викторианский стул!");
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return "Викторианский стул: цвет = " + color + ", размер = " + size;
    }
}
