package ru.job4j.oop;

import java.lang.reflect.Field;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error test = new Error(true, 111, "This is test");
        test.printInfo();
        Error empty = new Error();
        empty.printInfo();
        Error cast = new Error(false, 10, "Chief! It's all gone, it's all gone! The cast is being removed, the client is leaving!");
        cast.printInfo();
        Error bird = new Error(false, 123, "sorry for the bird");
        bird.printInfo();
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
        System.out.println();
    }
}
