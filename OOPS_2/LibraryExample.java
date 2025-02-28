// Library Management 📚
// Problem Statement:
// Create a base class LibraryItem with:

// Attributes: title, author
// A method displayDetails().
// Create two subclasses:

// Book with an additional pageCount attribute.
// Magazine with an additional issueNumber attribute.
// Create objects and demonstrate inheritance.
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
public class LibraryExample{
    public static void main(String[] args) {
        
    }
}