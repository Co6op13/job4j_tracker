package ru.job4j.oop;

public class Wolf {
    private String name = "Wolf";

    public void tryEat(Ball ball) {
        ball.truRun(false, name);
    }
}
