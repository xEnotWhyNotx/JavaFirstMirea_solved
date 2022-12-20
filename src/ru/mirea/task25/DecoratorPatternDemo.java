package ru.mirea.task25;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circleObject = new Circle();
        Shape rectangleObject = new Rectangle();

        Shape redRectangleObject = new RedShapeDecorator(rectangleObject);
        Shape redCircleObject = new RedShapeDecorator(circleObject);

        redRectangleObject.draw();
        redCircleObject.draw();
    }
}