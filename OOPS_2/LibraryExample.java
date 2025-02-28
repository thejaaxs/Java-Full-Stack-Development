package OOPS_2;

class libraryItem{
    String title,author ;

    libraryItem(String title,String author){
        this.title=title;
        this.author=author;
    }

    void displayDetails(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
    }
}
class Book extends libraryItem{
    int pageCount ;
    Book(String title,String author,int pageCount){
        super(title,author);
        this.pageCount = pageCount;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Page Count : "+pageCount);
    }
}
class Magazine extends libraryItem{
    int issueNumber ;
    Magazine(String title,String author,int issueNumber){
        super(title,author);
        this.issueNumber = issueNumber ;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Issue Number : "+issueNumber);
    }
}
public class LibraryExample{
    public static void main(String[] args) {
        Book book = new Book("Java Programming","Jhon Doe",500);
        Magazine mag = new Magazine("Amazon","Jeff Bezoz",250);

        mag.displayDetails();
        book.displayDetails();
    }
}