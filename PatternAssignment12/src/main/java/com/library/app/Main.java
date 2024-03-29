package com.library.app;

import com.library.app.pojo.Book;
import com.library.app.pojo.CD;
import com.library.app.pojo.Magazine;
import com.library.app.repositury.ItemRepository;
import com.library.app.service.ItemService;
import com.library.app.service.Service;

import java.util.Scanner;

public class Main {

    static ItemRepository repository;

    static Service service;
    static boolean running;
    static Scanner scan;

    public static void main(String[] args) {

        scan = new Scanner(System.in);
        repository = new ItemRepository();
        service = new ItemService(repository);

        welcome();

        running = true;
        while (running) {
            commands();

            String response = scan.next();
            switch (response) {
                case "save" : save(); break;
                case "find" : find(); break;
                case "delete" : delete(); break;
                case "display" : display(); break;
                case "exit" : running = false; break;
            }
        }
    }

    private static void welcome() {
        System.out.println("|-------------------------------------------|");
        System.out.println("              Welcome to Library              ");
        System.out.println("|-------------------------------------------|");
    }

    private static void commands() {
        System.out.println("\nPrint: ");
        System.out.println("'save' -> to add a item");
        System.out.println("'find' -> to retrieve a item by id");
        System.out.println("'delete' -> to remove a item from catalog");
        System.out.println("'display' -> to see all catalog");
        System.out.println("'exit' -> to exit");
    }

    private static void save() {
        System.out.println("\nPrint type of item 'Book', 'CD', 'Magazine'): ");
        String type = scan.next();
        switch (type) {
            case "Book": createBook(); break;
            case "CD": createCD(); break;
            case "Magazine": createMagazine(); break;
            default:
                System.out.println("Invalid type. Try again!");
                save();
        }
    }

    private static void createBook() {
        System.out.println("Enter isbn, title, author, year: ");

        System.out.print("ISBN: ");
        long isbn = scan.nextLong();
        scan.nextLine();
        System.out.print("Title: ");
        String title = scan.nextLine();
        System.out.print("Author: ");
        String author = scan.nextLine();
        System.out.print("Year: ");
        int year = scan.nextInt();
        scan.nextLine();

        service.save(new Book(repository.getId(), title, author, year, isbn));
    }

    private static void createCD() {
        System.out.println("Enter sid number, title, author, year: ");

        System.out.print("Sid Number: ");
        long sidNumber = scan.nextLong();
        scan.nextLine();
        System.out.print("Title: ");
        String title = scan.nextLine();
        System.out.print("Author: ");
        String author = scan.nextLine();
        System.out.print("Year: ");
        int year = scan.nextInt();
        scan.nextLine();

        service.save(new CD(repository.getId(), title, author, year, sidNumber));
    }

    private static void createMagazine() {
        System.out.println("Enter issn, title, author, year: ");

        System.out.print("ISSN: ");
        long issn = scan.nextLong();
        System.out.print("Title: ");
        scan.nextLine();
        String title = scan.nextLine();
        System.out.print("Author: ");
        String author = scan.nextLine();
        System.out.print("Year: ");
        int year = scan.nextInt();
        scan.nextLine();

        service.save(new Magazine(repository.getId(), title, author, year, issn));
    }

    private static void find() {
        System.out.print("Enter id: ");
        System.out.println(service.find(scan.nextInt()));
        scan.nextLine();
    }

    private static void delete() {
        System.out.print("Enter id: ");
        service.delete(scan.nextInt());
        scan.nextLine();
        System.out.println("The item deleted successfully");
    }

    private static void display() {
        System.out.println(service.findAll());
    }


}
