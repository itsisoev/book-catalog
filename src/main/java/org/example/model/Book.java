package org.example.model;

public class Book {
    private int id;
    private String title;
    private String author;
    private int year;
    private Genre genre;
    private boolean isRead;

    public Book(String title, String author, int year, Genre genre, boolean isRead) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.isRead = isRead;
    }

    public Book(int id, String title, String author, int year, Genre genre, boolean isRead) {
        this(title, author, year, genre, isRead);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public Genre getGenre() {
        return genre;
    }

    public boolean isRead() {
        return isRead;
    }
}
