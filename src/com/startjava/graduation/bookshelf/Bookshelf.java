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

    public void add(Book book) {
        books[amountBooks] = book;
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
        for (int i = 0; i < amountBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                if (books[i].getInfoLength() == maxInfoLength) {
                    researchMaxInfoLength(i);
                }
                amountBooks--;
                if (i != amountBooks) {
                    System.arraycopy(books, i + 1, books, i, amountBooks - i);
                }
                books[amountBooks] = null;
                return true;
            }
        }
        return false;
    }

    private void researchMaxInfoLength(int outerIndex) {
        maxInfoLength = 0;
        for (int i = 0; i < amountBooks; i++) {
            int currentInfoLength = books[i].getInfoLength();
            if (currentInfoLength > maxInfoLength && i != outerIndex) {
                maxInfoLength = currentInfoLength;
            }
        }
    }

    public void clear() {
        Arrays.fill(books, 0, amountBooks, null);
        amountBooks = 0;
    }
}