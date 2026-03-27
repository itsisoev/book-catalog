package org.example;

import org.example.dao.*;
import org.example.model.*;

public class Main {
    public static void main(String[] args) {

        DatabaseInitializer.initialize();

        BookDAO dao = new BookDAO();

        dao.addBook(new Book("Clean Code", "Robert Martin", 2008, Genre.SCIENCE, true));

        dao.getAllBooks().forEach(b ->
                System.out.println(b.getTitle() + " - " + b.getAuthor())
        );
    }
}