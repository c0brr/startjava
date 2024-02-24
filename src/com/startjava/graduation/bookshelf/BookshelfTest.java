package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private static final Bookshelf bookshelf = new Bookshelf();
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean isProgramClosed;

    public static void main(String[] args) {
        while (!isProgramClosed) {
            printBookshelf();
            printMenu();
            runCommand(choiceCommand());
            inputEnter();
        }
        scanner.close();
    }

    private static void printBookshelf() {
        int amountBooks = bookshelf.getAmountBooks();
        if (amountBooks == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу.\n");
            return;
        }
        System.out.println("В шкафу книг - " + amountBooks +
                ", свободно полок - " + bookshelf.getEmptyShelves() + "\n");
        int lengthShelves = bookshelf.getLengthShelves();
        String dash = "-".repeat(lengthShelves);
        for (Book book : bookshelf.getAllBooks()) {
            String space = " ".repeat(lengthShelves - book.getInfoLength());
            System.out.printf("|%s%s|\n", book, space);
            System.out.printf("|%s|\n", dash);
        }
        System.out.printf("|%s|\n\n", " ".repeat(lengthShelves));
    }

    private static void printMenu() {
        System.out.print("""
                       Меню
                1. Сохранить книгу
                2. Найти книгу
                3. Удалить книгу
                4. Очистить шкаф
                5. Завершить
                                
                Выбрать команду:
                """);
    }

    private static int choiceCommand() {
        int command = 0;
        boolean isCommandAcceptable = false;
        while (!isCommandAcceptable) {
            try {
                command = Integer.parseInt(scanner.nextLine());
                if (command < 1 || command > 5) {
                    throw new RuntimeException();
                }
                isCommandAcceptable = true;
            } catch (RuntimeException e) {
                System.out.println("Ошибка: введенная команда не поддерживается. Введите корректную команду: ");
            }
        }
        return command;
    }

    private static void runCommand(int command) {
        switch (command) {
            case 1:
                addBook();
                break;
            case 2:
                findBook();
                break;
            case 3:
                deleteBook();
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

    private static void addBook() {
        System.out.println("Введите информацию о книге в следующем формате: " +
                "Автор::Название книги::Год издания");
        try {
            Book book = new Book(scanner.nextLine());
            bookshelf.add(book);
            System.out.println("Новая книга добавлена в шкаф.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void findBook() {
        System.out.println("Введите название искомой книги:");
        try {
            System.out.println("Найденная книга: " + bookshelf.find(scanner.nextLine()));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void deleteBook() {
        System.out.println("Введите название удаляемой книги:");
        if (bookshelf.delete(scanner.nextLine())) {
            System.out.println("Выбранная книга удалена.");
        } else {
            System.out.println("Книга не удалена(отсутствует в шкафу).");
        }
    }

    private static void inputEnter() {
        if (!isProgramClosed) {
            do {
                System.out.println("Для продолжения нажмите Enter. ");
            } while (!scanner.nextLine().isEmpty());
        }
    }
}