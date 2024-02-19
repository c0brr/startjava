package com.startjava.graduation.bookshelf;

import java.util.Arrays;

class Bookshelf {
    public static final int MAX_BOOKS = 10;
    private final Book[] books = new Book[MAX_BOOKS];
    private int amountBooks;
    private int maxInfoLength;

    public int getAmountBooks() {
        return amountBooks;
    }

    public int getMaxInfoLength() {
        return maxInfoLength;
    }

    public int getEmptyShelfs() {
        return MAX_BOOKS - amountBooks;
    }

    public Book[] getAllBooks() {
        return Arrays.copyOf(books, amountBooks);
    }

    public void add(String bookInfo) {
        try {
            books[amountBooks] = new Book(bookInfo);
        } catch (RuntimeException exception) {
            throw new RuntimeException(exception.getMessage());
        }
        if (books[amountBooks].getInfoLength() > maxInfoLength) {
            maxInfoLength = books[amountBooks].getInfoLength();
        }
        amountBooks++;
    }

    public Book find(String title) {
        for (int i = 0; i < amountBooks; i++) {
            if(books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        throw new RuntimeException("Книга не найдена.");
    }

    public boolean delete(String title) {
        int maxIndex = amountBooks - 1;
        for (int i = 0; i <= maxIndex; i++) {
            if (books[i].getTitle().equals(title)) {
                if (books[i].getInfoLength() == maxInfoLength) {
                    maxInfoLength = 0;
                    for (int j = 0; j <= maxIndex; j++) {
                        int infoLength = books[j].getInfoLength();
                        if (infoLength > maxInfoLength && j != i) {
                            maxInfoLength = infoLength;
                        }
                    }
                }
                if (i != maxIndex) {
                    System.arraycopy(books, i + 1, books, i, maxIndex - i);
                }
                books[maxIndex] = null;
                amountBooks--;
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(books, 0, amountBooks, null);
        amountBooks = 0;
    }
}