package ru.mirea.task20;

import java.util.ArrayList;
import java.util.List;

public class TestGenericClass {
    public static void main(String[] args) {
        Integer obj1 = 4;
        Animal dog = new Animal("Jack", 2);
        double[] array = new double[]{412.24, 0.33, 94.0};
        GenericClass genericClass = new GenericClass(obj1, dog, array);

        genericClass.printAllVars();
    }
}
