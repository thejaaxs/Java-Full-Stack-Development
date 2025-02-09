// Books Management System Using the OOPS 

package OOPS;

class Books {
    String title , author ;
    double price ;

    public Books(String title , String author , double price){
        this.title = title ;
        this.author = author ;
        this.price = price ;
    }
    public void discountPercentage(double discount){
        price -= price * (discount / 100) ;
    }
    public void displayDetails(){
        System.out.println("The Title : "+title+"\nThe Author : "+author+"\nThe Price : "+price);
    }
}
public class BooksManagement {
    public static void main(String[] args) {
        Books b1 = new Books("Ramayana","Valmiki",1234.56);
        b1.discountPercentage(10);
        b1.displayDetails();
    }
}
