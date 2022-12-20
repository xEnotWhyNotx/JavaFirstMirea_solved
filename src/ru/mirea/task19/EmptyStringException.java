package ru.mirea.task19;

public class EmptyStringException extends RuntimeException {
    public EmptyStringException(String errorMessage) {
        super(errorMessage);
    }

    public EmptyStringException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }

}
