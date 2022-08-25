package ru.job4j.pojo;

public class Library {

    public static void printArray(Book[] books) {
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getPageCount());
        }
        System.out.println();
    }

    public static void findBook(Book[] books, String name) {
        for (Book book : books) {
            if (name.equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getPageCount());
            }
        }
        System.out.println();
    }

    private static void swapPlace(Book[] books, int first, int second) {
        if (first < books.length && first >= 0 && second < books.length && second >= 0) {
            var temp = books[first];
            books[first] = books[second];
            books[second] = temp;
        } else {
            System.out.println("неверный индекс. При замене произошла ошибка");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Head First Java", 722);
        books[1] = new Book("Clean code", 464);
        books[2] = new Book("Java 8. Полное руководство", 1375);
        books[3] = new Book("Расплетающие Сновидения", 496);
        printArray(books);
        swapPlace(books, 0, 3);
        printArray(books);
        findBook(books, "Clean code");
    }
}
