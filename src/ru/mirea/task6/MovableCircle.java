package ru.mirea.task6;

public class MovableCircle implements Movable{

    protected int radius;

    protected MovablePoint center;



    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {

        this.radius = radius;

        this.center = new MovablePoint(x,y,xSpeed,ySpeed);

    }



    @Override

    public String toString() {

        return "MovableCircle{" +

                "radius=" + radius +

                ", center=" + center +

                '}';

    }



    public void moveUp() {

        center.moveUp();

    }



    public void moveDown() {

        center.moveDown();

    }



    public void moveLeft() {

        center.moveLeft();

    }



    public void moveRight() {

        center.moveRight();

    }

}