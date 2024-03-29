package com.library.app.pojo;

public class CD extends Item {
    private long sidNumber;

    public CD(int id, String title, String author, int year, long sidNumber) {
        super(id, title, author, year);
        this.sidNumber = sidNumber;
    }

    public long getSidNumber() {
        return sidNumber;
    }

    public void setSidNumber(long sidNumber) {
        this.sidNumber = sidNumber;
    }

    @Override
    public String toString() {
        return "CD{" +
                "sidNumber=" + sidNumber +
                super.toString() +
                '}';
    }
}
