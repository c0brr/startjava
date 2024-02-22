package com.startjava.graduation.bookshelf;

import java.util.Arrays;

class Bookshelf {
    public static final int MAX_BOOKS = 10;
    private final Book[] books = new Book[MAX_BOOKS];
    private int amountBooks;
    private int lengthShelves;

    public int getAmountBooks() {
        return amountBooks;
    }

    public int getLengthShelves() {
        return lengthShelves;
    }

    public int getEmptyShelves() {
        return MAX_BOOKS - amountBooks;
    }

    public Book[] getAllBooks() {
        return Arrays.copyOf(books, amountBooks);
    }

    public void add(Book book) {
        if (amountBooks < MAX_BOOKS) {
            books[amountBooks] = book;
            lengthShelves = Math.max(book.getInfoLength(), lengthShelves);
            amountBooks++;
            return;
        }
        throw new RuntimeException("Шкаф заполнен. Удалите одну из книг, если хотите добавить новую книгу.");
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
                researchLengthShelves(i);
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

    private void researchLengthShelves(int outerIndex) {
        if (books[outerIndex].getInfoLength() == lengthShelves) {
            lengthShelves = 0;
            for (int i = 0; i < amountBooks; i++) {
                if (i != outerIndex) {
                    lengthShelves = Math.max(books[i].getInfoLength(), lengthShelves);
                }
            }
        }
    }

    public void clear() {
        Arrays.fill(books, 0, amountBooks, null);
        amountBooks = 0;
    }
}