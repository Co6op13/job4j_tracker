package ru.job4j.oop;

public class Calculator {
    private static int x = 2;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public float devide(int y) {
        return (float) y / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public float sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + devide(y);
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(minus(10));
        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(10));
        System.out.println(calculator.devide(10));
        System.out.println(calculator.sumAllOperation(10));
    }
}