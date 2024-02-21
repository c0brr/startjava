package com.startjava.graduation.bookshelf;

class Book {
    public static final int ACCEPTABLE_LENGTH = 3;
    private final String author;
    private final String title;
    private final String yearPublication;
    private final int infoLength;

    public Book(String info) {
        String[] infoElements = info.split("::");
        if (infoElements.length != ACCEPTABLE_LENGTH) {
            throw new RuntimeException("Ошибка: вы ввели неверный формат книги.");
        }
        author = infoElements[0];
        title = infoElements[1];
        yearPublication = infoElements[2];
        infoLength = info.length();
    }

    public String getTitle() {
        return title;
    }

    public int getInfoLength() {
        return infoLength;
    }

    public String toString() {
        return author + ", " + title + ", " + yearPublication;
    }
}