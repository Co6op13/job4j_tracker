package ru.job4j.oop;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int horizontal, int vertical) {
        this.x = horizontal;
        this.y = vertical;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point another) {
        return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow((this.y - another.y), 2));
    }

    public double distance3d(Point another) {
        return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow((this.y - another.y), 2) + Math.pow((this.z - another.z), 2));
    }

}
