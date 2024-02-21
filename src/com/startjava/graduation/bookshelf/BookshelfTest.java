package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean isProgramClosed;

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        while (!isProgramClosed) {
            printBookshelf(bookshelf);
            System.out.print("""
                       Меню
                1. Сохранить книгу
                2. Найти книгу
                3. Удалить книгу
                4. Очистить шкаф
                5. Завершить
                                
                Выбрать команду:
                """);
            workCommand(choiceCommand(), bookshelf);
            if (!isProgramClosed) {
                do {
                    System.out.println("Для продолжения нажмите Enter. ");
                } while (!scanner.nextLine().isEmpty());
            }
        }
        scanner.close();
    }

    private static void printBookshelf(Bookshelf bookshelf) {
        int amountBooks = bookshelf.getAmountBooks();
        int length = bookshelf.getMaxInfoLength();
        if (amountBooks == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу.\n");
            return;
        }
        System.out.println("В шкафу книг - " + amountBooks +
                ", свободно полок - " + bookshelf.getEmptyShelfs() + "\n");
        String dash = "-".repeat(length);
        for (Book book : bookshelf.getAllBooks()) {
            String space = " ".repeat(length - book.getInfoLength());
            System.out.printf("|%s%s|\n", book, space);
            System.out.printf("|%s|\n", dash);
        }
        System.out.printf("|%s|\n\n", " ".repeat(length));
    }

    private static int choiceCommand() {
        int command = 0;
        try {
            command = Integer.parseInt(scanner.nextLine());
            if (command < 1 || command > 5) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("Ошибка: введенная команда не поддерживается.");
        }
        return command;
    }

    private static void workCommand(int command, Bookshelf bookshelf) {
        switch (command) {
            case 1:
                if (bookshelf.getAmountBooks() < Bookshelf.MAX_BOOKS) {
                    addBook(bookshelf);
                } else {
                    System.out.println("Шкаф заполнен. Удалите одну из книг, если хотите добавить новую книгу.");
                }
                break;
            case 2:
                findBook(bookshelf);
                break;
            case 3:
                deleteBook(bookshelf);
                break;
            case 4:
                bookshelf.clear();
                System.out.println("Вы очистили весь шкаф от книг.");
                break;
            case 5:
                isProgramClosed = true;
                System.out.println("Завершение работы.");
        }
    }

    private static void addBook(Bookshelf bookshelf) {
        System.out.println("Введите информацию о книге в следующем формате: " +
                "Автор::Название книги::Год издания");
        try {
            Book book = new Book(scanner.nextLine());
            bookshelf.add(book);
            System.out.println("Новая книга добвлена в шкаф.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void findBook(Bookshelf bookshelf) {
        System.out.println("Введите название книги, чтобы найти ее:");
        try {
            System.out.println("Найденная книга: " + bookshelf.find(scanner.nextLine()));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void deleteBook(Bookshelf bookshelf) {
        System.out.println("Введите название книги, чтобы удалить ее:");
        if (bookshelf.delete(scanner.nextLine())) {
            System.out.println("Выбранная книга удалена.");
        } else {
            System.out.println("Книга не удалена(отсутствует в шкафу).");
        }
    }
}