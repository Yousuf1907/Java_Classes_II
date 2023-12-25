public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int numPages;

    public Book() {
        this.title = "Rick Riordan";
        this.author = "THE DARK PROPHECY";
        this.ISBN = "97531";
        this.numPages = 484;
    }
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Number of Pages: " + numPages);
        System.out.println("------------------------------");
    }

    public Book(String title, String author, String ISBN, int numPages) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.numPages = numPages;
    }
}

