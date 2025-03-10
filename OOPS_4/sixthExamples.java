// Products Example Using OOPS

class Products {
    private String productName;
    private double price;
    private int quantity;

    public Products(String productName,double price,int quantity){
        this.productName=productName;
        setPrice(price);
        setQuantity(quantity);
    }

    public void setPrice(double price){
        if(price>=0){
            this.price = price ;
        }
        else System.out.println("Invalid Price !");
    }
    public void setQuantity(int quantity){
        if(quantity>=0){
            this.quantity = quantity;
        }
        else System.out.println("Qualtity Cannot be negative !");
    }
    public double getTotalPrice(){
        return price * quantity ;
    }
    public String getProductName(){
        return productName;
    }
}

public class sixthExamples {
    public static void main(String[] args) {
        Products item1 = new Products("Iphone",210000.100,2);
        System.out.println("Total Price : Rs."+item1.getTotalPrice());
        item1.setQuantity(1);
        item1.setPrice(100000.100); // Price drop !
        System.out.println("Total Price : Rs."+item1.getTotalPrice());
    }
}
