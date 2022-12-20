package ru.mirea.task2.task3;

public class Circle {
    private Point center;

    public Circle(double x, double y) {
        this.center = new Point(x, y);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
