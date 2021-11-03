package com.easton;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
      
        Book b1 = new Book("Java Generics", "Liam Easton");
        Book b2 = new Book("Java Collections", "Liam Easton");
        Book b3 = new Book("Java Collections", "Jacob Rugger");

        System.out.println("Hi");

        Book b4 = new ChildrensBook("Java for Kids", "Jacob", "Liam");

        List<Book> bookshelf = new ArrayList<>();
        bookshelf.add(b1);
        bookshelf.add(b2);
        bookshelf.add(b3);
        bookshelf.add(0, b4);

        for(int i = 0; i < bookshelf.size(); i++) {
            System.out.println(bookshelf.get(i));
        }
    }
}
