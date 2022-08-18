package ru.job4j.oop;

public class Point {
    private int x;
    private int y;

    public Point(int horizontal, int vertical) {
        this.x = horizontal;
        this.y = vertical;
    }

    public double distance(Point another) {
        return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow((this.y - another.y), 2));
    }
}
