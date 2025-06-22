public class Book{
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    static boolean linearSearch(Book[] books, String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    static boolean binarySearch(Book[] books, String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int val = books[mid].title.compareToIgnoreCase(title);

            if (val == 0) {
                return true;
            } else if (val < 0) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return false;
    }


    public static void main(String[] args) {
        
        System.out.println("\nLibrary Management System\n");

        Book[] books = {
            new Book(1, "How To Kill a Mockingbird", "Harper Lee"),
            new Book(6, "Lord of the Rings", "J.R.R. Tolkien"),
            new Book(2, "Pride and Prejudice", "George Orwell"),
            new Book(4, "The Catcher in the Rye", "J.D. Salinger"),
            new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(5, "Your Growth", "George Orwell")
        };

        System.out.println("Book ID\tTitle\t\t\t\tAuthor");
        for (Book book : books) {
            System.out.printf("%d\t%s\t\t%s\n", book.bookId, book.title, book.author);
        }
        System.out.println();

        boolean find = false;
        String t = "Pride and Prejudice";
        find = linearSearch(books, t);
        System.out.println("\nSearching using Linear Search:\n");
        System.out.println("Searching for book with title " + t + "..... \n" + (find ? "Found..!!" : "Not Found..!!\n"));

        find = false;
        // t = "The Catcher Rye";
        find = binarySearch(books, t);
        System.out.println("\nSearching using Binary Search:\n");
        System.out.println("Searching for book with title " + t + "..... \n" + (find ? "Found..!!" : "Not Found..!!\n"));

    }
}