package ru.job4j.oop;

public class Ball {
    Object[] passed = new Object[3];
    int count = 0;

    public void left(String name) {
        System.out.print("I left my grandmother, ");
        for (int i = 0; i < count; i++) {
            System.out.print("and left the " + passed[i] + ", ");
        }
        System.out.println("and I'll leave you, " + name);
        passed[count] = name;
        count++;
        System.out.println("Ball escaped from the " + name);
    }

    public void truRun(boolean condition, String name) {
        if (condition) {
            System.out.println("Ball is eaten by a " + name);
        } else {
            this.left(name);
        }
    }
}
