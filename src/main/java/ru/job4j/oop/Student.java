package ru.job4j.oop;

public class Student {
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music("Падший");
        petya.music("Горящаяя стрелла");
        petya.music("Путь война");
        petya.song();
        petya.song();
        petya.song();
    }

    public void music(String lyrics) {
        System.out.println("I can sign a song : " + lyrics);
    }

    public void song() {
        System.out.println("I belive I can fly");
    }
}
