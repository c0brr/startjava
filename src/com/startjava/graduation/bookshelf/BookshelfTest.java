package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean isProgramClosed;

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        String menu = """
                       Меню
                1. Сохранить книгу
                2. Найти книгу
                3. Удалить книгу
                4. Очистить шкаф
                5. Завершить
                                
                Выбрать команду:
                """;

        while (!isProgramClosed) {
            int command = 0;
            printBookshelf(bookshelf);
            System.out.print(menu);

            try {
                command = Integer.parseInt(scanner.nextLine());
                if (command < 1 || command > 5) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException exception) {
                System.out.println("Ошибка: введенная команда не поддерживается.");
            }

            workCommand(command, bookshelf);

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

    public static void workCommand(int command, Bookshelf bookshelf) {
        switch (command) {
            case 1:
                if (bookshelf.getAmountBooks() < Bookshelf.MAX_BOOKS) {
                    System.out.println("Введите информацию о книге в следующем формате: " +
                            "Автор::Название книги::Год издания");
                    try {
                        bookshelf.add(scanner.nextLine());
                        System.out.println("Новая книга добвлена в шкаф.");
                    } catch (RuntimeException exception) {
                        System.out.println(exception.getMessage());
                    }
                } else {
                    System.out.println("Шкаф заполнен. Удалите одну из книг, если хотите добавить новую книгу.");
                }
                break;
            case 2:
                System.out.println("Введите название книги, чтобы найти ее:");
                try {
                    System.out.println("Найденная книга: " + bookshelf.find(scanner.nextLine()));
                } catch (RuntimeException exception) {
                    System.out.println(exception.getMessage());
                }
                break;
            case 3:
                System.out.println("Введите название книги, чтобы удалить ее:");
                if (bookshelf.delete(scanner.nextLine())) {
                    System.out.println("Выбранная книга удалена.");
                } else {
                    System.out.println("Книга не удалена(отсутствует в шкафу).");
                }
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
}