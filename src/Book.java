/*
* create a book class for library system.
* instance variable: title, authore, isbn
* static variable: total books, a counter of total number of book instances;
* instance method: borrowBook(), returnBook()
* static methods: getTotalBooks(), to get the total number of books in the library
* */

public class Book {
String title;
String author;
int isbn;

static int totalBooks=0;

Book(String title, String author, int isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;

    totalBooks++;
}

boolean isAvailable = true;

public void borrowBook(){
    if(isAvailable){
        System.out.println("Book is Available you can borrow.");
        isAvailable = false;
    }else {
        System.out.println("Book is not Available");
    }
}

public void returnBook(){
    if(!isAvailable){
        System.out.println("book is return successfully");
        isAvailable = true;
    }
}

public static void getTotalBooks(){
    System.out.println("Total Books: "+totalBooks);
}

}
