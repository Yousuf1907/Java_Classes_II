public class BookMain {
    public static void main(String[] args) {
        Book def_Book = new Book();
        System.out.println("Book Info:");
        def_Book.displayBookInfo();

        Book para_Book = new Book("Travels with Trolls", " Gideroy Lockhart", "610691", 291);
        System.out.println("Parameterized Book Information:");
        para_Book.displayBookInfo();
    }
}
