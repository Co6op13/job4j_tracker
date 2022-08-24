package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Head First Java", 722);
        books[1] = new Book("Clean code", 464);
        books[2] = new Book("Java 8. Полное руководство", 1375);
        books[3] = new Book("Расплетающие Сновидения", 496);
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getPageCount());
        }
        Book temp =  books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book book : books) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getPageCount());
            }
        }
    }
}
