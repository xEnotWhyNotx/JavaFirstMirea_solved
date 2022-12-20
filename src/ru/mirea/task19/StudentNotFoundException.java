package ru.mirea.task19;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
