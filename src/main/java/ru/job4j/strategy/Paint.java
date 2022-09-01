package ru.job4j.strategy;

public class Paint {

    public void draw(Shape shape) {
        System.out.print(shape.draw());
    }

    public static void main(String[] args) {
        Paint picture = new Paint();
        picture.draw(new Rhomb());
        picture.draw(new Triangle());
        picture.draw(new Square());
    }
}
