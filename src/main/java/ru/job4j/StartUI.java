package ru.job4j;

import ru.job4j.tracker.Item;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item test = new Item();
        System.out.println(test.getCreated().format(DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss")));
    }
}
