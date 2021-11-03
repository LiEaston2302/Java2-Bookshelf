package com.easton;

public class Main {

    public static void main(String[] args) {
      
        Book b1 = new Book("Java Generics", "Liam Easton");
        Book b2 = new Book("Java Collections", "Liam Easton");
        Book b3 = new Book("Java Collections", "Jacob Rugger");

        System.out.println("Hi");

        Book b4 = new ChildrensBook("Java for Kids", "Jacob", "Liam");
    }
}
