package ru.job4j.oop;

public class Bear {
    private String name = "Bear";

    public void tryEat(Ball ball) {
        ball.truRun(false, name);
    }
}
