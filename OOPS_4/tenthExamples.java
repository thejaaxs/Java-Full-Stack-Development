// Shopping Cart ! 

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<String> items;
    private List<Double> prices;

    public ShoppingCart() {
        items = new ArrayList<>();
        prices = new ArrayList<>();
    }

    public void addItem(String item, double price) {
        items.add(item);
        prices.add(price);
    }

    public void removeItem(String item) {
        int index = items.indexOf(item);
        if (index != -1) {
            items.remove(index);
            prices.remove(index);
        } else
            System.out.println("Items not found in the Cart !");
    }

    public double getTotalPrice() {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public void checkout() {
        System.out.println("Total Price : " + getTotalPrice());
        items.clear();
        prices.clear();
        System.out.println("Checkout Complete , Cart is now empty !");
    }
}

public class tenthExamples {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 1000);
        cart.addItem("Iphone", 500);
        System.out.println("Total Price : " + cart.getTotalPrice());
        cart.removeItem("Iphone");
        System.out.println("Total Price : " + cart.getTotalPrice());
        cart.checkout();
    }
}
