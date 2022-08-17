package ru.job4j.oop;

public class Hare {
    private String name = "Hare";

    public void tryEat(Ball ball) {
        ball.truRun(false, name);
    }
}
