package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Task 1
        String text = "V's background and identity are never revealed. He is at one point an inmate at \"Larkhill Resettlement Camp\"—one of many concentration camps where black people, Jews, leftists, beatniks, homosexuals and Ethnic Irish are exterminated by Norsefire, a fascist dictatorship that rules Britain. While there, he is part of a group of prisoners who are subjected to horrific medical experimentation, conducted by Dr. Delia Surridge. Lewis Prothero is the camp's commandant, while Father Anthony Lilliman, a paedophile vicar, is at the camp to lend \"spiritual support\". All prisoners who are part of the experiment die, with the sole exception of \"the man in room five\" (\"V\" in Roman numerals). As a result of the experiments, the man develops Olympic-level physical abilities and an incredibly expanded intellect. During that time, the man had some level of communication with Valerie Page, a former actress imprisoned for being a lesbian, kept in \"room four\", who wrote her autobiography on toilet paper and then pushed it through a hole in the wall.";
        WordCollector wordCollector = new WordCollector();
        System.out.println(wordCollector.collectWordsStartingWith(text, "O"));

        //Task 2
        Book book = new Book();
        List<Book> books = new ArrayList<>();
        book.createListOfBooks(books,10);

        System.out.println(books);
        System.out.println("");

        System.out.println(book.namesOfBooks(books));
        System.out.println("");

        System.out.println(book.totalPriceOfBooks(books));
        System.out.println("");

        System.out.println(book.booksWithNameStartingWith(books,"o"));
        System.out.println("");

        System.out.println(book.mostExpensiveBook(books));
        System.out.println("");

        System.out.println(book.booksWithNameLengthOf(books,5));
        System.out.println("");

        System.out.println(book.booksWithPriceUpTo(books,30));
        System.out.println("");

        System.out.println(book.sortBooks(books));
        System.out.println("");

        //Task 2.2
        Book book1 = new Book("myBook",5);
        Book book2 = new Book("myBook",5);

        Map<Book, String> mapWithBook = new HashMap<>();
        mapWithBook.put(book1, "City Library Mannheim");

        mapWithBook.forEach((key, value) -> {
            if (Objects.equals(key, book2)) {
                System.out.print(value);
            }
        });

        //Task 3
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Peter", "Patterson", 21));
        personList.add(new Person("Paul", "Walker", 31));
        personList.add(new Person("Steve", "Runner", 17));
        personList.add(new Person("Arnold", "", -1));
        personList.add(new Person(" ", "Stevenson", 19));
        personList.add(new Person("   ", "Stevenson", 19));
        personList.add(new Person("      ", "Stevenson", 19));
        personList.add(new Person(" Arnold", "Stevenson", 19));
        personList.add(null);
        personList.add(new Person("Aaron", "Bortnicker", 18));

        System.out.println(Person.uniqueNames(personList));

        //Task 4
        StringFunction exclaim = s -> s + "! ";
        StringFunction ask = s -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.print(result);
    }
}