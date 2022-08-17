package ru.job4j.oop;

public class Story {

    public static void main(String[] args) {

        Ball ball = new Ball();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();
        Hare hare = new Hare();
        Bear bear = new Bear();

        hare.tryEat(ball);
        wolf.tryEat(ball);
        bear.tryEat(ball);
        fox.tryEat(ball);
    }
}
