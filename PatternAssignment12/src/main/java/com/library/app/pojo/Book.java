package com.library.app.pojo;

public class Book extends Item {
    private long isbn;

    public Book(int id, String title, String author, int year, long isbn) {
        super(id, title, author, year);
        this.isbn = isbn;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                super.toString() +
                '}';
    }
}
