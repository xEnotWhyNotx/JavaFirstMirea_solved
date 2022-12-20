package ru.mirea.task7;

public class MovableRectangle implements Movable

{

    private MovablePoint topLeft;

    private MovablePoint bottomRight;



    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)

    {

        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);

        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);

        if (!topLeft.speedTest(bottomRight))

        {

            System.out.println("Скорости не равны");

        }

    }

    @Override

    public void moveUp()

    {

        topLeft.moveUp();

        bottomRight.moveUp();

        return;

    }



    @Override

    public void moveDown()

    {

        topLeft.moveDown();

        bottomRight.moveDown();

    }



    @Override

    public void moveLeft()

    {

        topLeft.moveLeft();

        bottomRight.moveLeft();

    }



    @Override

    public void moveRight()

    {

        topLeft.moveRight();

        bottomRight.moveRight();

    }



    @Override

    public String toString() {

        return "Top left: " + topLeft.toString() + "\n" + "Bottom right: " + bottomRight.toString();

    }

}