package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    private static Scanner scanner;
    private static Tracker tracker;

    private static void itemAdd() {
        System.out.println("=== Create a new Item ===");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        tracker.add(new Item(name));
        System.out.println("Добавленная заявка: " + name);
        System.out.println();
    }

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                itemAdd();
            } else {
                run = false;
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
