package ru.job4j.poly;

public class TestUpcast {
    public static void main(String[] args) {
        Plane plane1 = new Plane();
        Bus bus1 = new Bus();
        Plane plane2 = new Plane();
        Train train1 = new Train();
        Plane plane3 = new Plane();
        Bus bus2 = new Bus();
        Train train2 = new Train();
        Vehicle[] test = new Vehicle[]{plane1, bus1, plane2, train1, plane3, bus2, train2};
        for (int i = 0; i < test.length; i++) {
            test[i].move();
        }
    }
}
