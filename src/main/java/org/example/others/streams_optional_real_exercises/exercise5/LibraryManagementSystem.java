package org.example.others.streams_optional_real_exercises.exercise5;


import java.util.*;
import java.util.stream.Collectors;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(
                Arrays.asList(
                        new Book(1, "The Hobbit", "J.R.R. Tolkien", true, 310, "Fantasy"),
                        new Book(2, "1984", "George Orwell", false, 328, "Dystopian"),
                        new Book(3, "To Kill a Mockingbird", "Harper Lee", true, 281, "Fiction"),
                        new Book(4, "Pride and Prejudice", "Jane Austen", true, 432, "Romance"),
                        new Book(5, "The Great Gatsby", "F. Scott Fitzgerald", false, 180, "Classic"),
                        new Book(6, "Moby Dick", "Herman Melville", true, 585, "Adventure"),
                        new Book(7, "War and Peace", "Leo Tolstoy", false, 1225, "Historical Fiction"),
                        new Book(8, "Brave New World", "Aldous Huxley", true, 268, "Science Fiction"),
                        new Book(9, "The Catcher in the Rye", "J.D. Salinger", true, 277, "Fiction"),
                        new Book(10, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", true, 309, "Fantasy")
                )
        );

        ////
        // Part 1
        List<Book> listOfAvailableBooks = books
                .stream()
                .filter(Book::isAvailable).toList();
        listOfAvailableBooks.forEach(book-> System.out.println("Book Title: "+book.getTitle()));

        System.out.println();

        ////
        // Part 2
        Long count = books.stream().filter(book -> book.getAuthor().equals("George Orwell")).count();
        System.out.println("Count of books published By George Orwell: "+count);

        ////
        // Part 3
        Optional<String> mostBorrowedBook = books
                .stream()
                .map(Book::getTitle)
                .max(Comparator.naturalOrder());
        mostBorrowedBook.ifPresent(book-> System.out.println("Most Borrowed Book Is: "+book));

        System.out.println();
        ////
        // Part 4
        Map<String, List<Book>> groupBooksByGenre = books
                .stream()
                .collect(Collectors.groupingBy(
                        Book::getGenre,
                        Collectors.toList()
                ));
        for( Map.Entry<String, List<Book>> e : groupBooksByGenre.entrySet() ){

            for(Book c : e.getValue()){
                System.out.print("Genre: "+e.getKey()+" <--> ");
                System.out.println("Book title: "+c.getTitle());
            }
        }
    }


}

class Book{
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;
    private int timesOfBorrowed;
    private String genre;

    public Book(int id, String title, String author, boolean isAvailable, int timesOfBorrowed, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
        this.timesOfBorrowed = timesOfBorrowed;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getTimesOfBorrowed() {
        return timesOfBorrowed;
    }

    public void setTimesOfBorrowed(int timesOfBorrowed) {
        this.timesOfBorrowed = timesOfBorrowed;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
