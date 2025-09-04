public class LibrarySimulation {
    public static void main(String[] args) {
        // Create some books
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 12345);
        Book b2 = new Book("Clean Code", "Robert C. Martin", 67890);
        Book b3 = new Book("Java Programming", "James Gosling", 11121);

        // Show total books
        Book.getTotalBooks(); // should print 3

        // Try borrowing books
        b1.borrowBook(); // should succeed
        b1.borrowBook(); // should fail (already borrowed)

        b2.borrowBook(); // should succeed

        // Try returning books
        b1.returnBook(); // should succeed
        b1.returnBook(); // should say "not borrowed"

        // Check total again
        Book.getTotalBooks(); // still 3
    }
}
