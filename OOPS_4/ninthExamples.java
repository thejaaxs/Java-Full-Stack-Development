// Library Book Class With Availability Check !
class LibraryBook {
    private String title;
    private String author;
    private boolean isAvailable;

    public LibraryBook(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book Borrowed Successfully !");
        } else
            System.out.println("Book has already been checked out !");
    }

    public void returnBook() {
        this.isAvailable = true;
        System.out.println("Book Returned Successfully !");
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void getBookInfo() {
        System.out.println("Title : " + title + "\nAuthor : " + author + "\nAvailable : " + isAvailable);
    }
}

public class ninthExamples {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Mehta-The Legend", "Thejas", true);
        book1.getBookInfo();
        book1.returnBook();
        System.out.println("---");
        book1.setAvailable(false);
        book1.getBookInfo();
        book1.returnBook();
        book1.borrowBook();
        book1.getBookInfo();
        book1.returnBook();
        book1.getBookInfo();
    }
}
