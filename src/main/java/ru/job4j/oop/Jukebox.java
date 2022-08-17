package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        String song = "Не найдено";
        if (position == 1) {
            song = "Пусть бугут неуклюже";
        } else if (position == 2) {
            song = "Спокойной ночи";
        }
        System.out.println(song);
    }

    public static void main(String[] args) {
        Jukebox little = new Jukebox();
        little.music(1);
        little.music(2);
        little.music(3);
    }
}
