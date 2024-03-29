package com.library.app.pojo;

public class Magazine extends Item {
    private long issn;

    public Magazine(int id, String title, String author, int year, long issn) {
        super(id, title, author, year);
        this.issn = issn;
    }

    public long getIssn() {
        return issn;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issn=" + issn +
                super.toString() +
                '}';
    }
}
