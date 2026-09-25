package Jobsheet1;

class Product {
    private final String itemName;
    private final float price;
    private static int totBrg = 0;

    public Product(String itemName, float price) {
        this.itemName = itemName;
        this.price = price;
        totBrg++; 
    }

    public float total(int quantity) {
        return price * quantity;
    }

    public String getName() {
        return itemName;
    }

    public static int getTotBrg() {
        return totBrg;
    }
}

public class OOP {
   
    public static void totalBelanjaan() {
        System.out.println("Total Belanjaan = " + Product.getTotBrg());
    }

    public static void main(String[] args) {
        Product product1 = new Product("Coffee", 120000.0f);
        Product product2 = new Product("Sugar", 30000.0f);
        Product product3 = new Product("Milk", 35000.0f);

        System.out.println(product1.getName() + ":" + product1.total(3));
        System.out.println(product2.getName() + ":" + product2.total(1));
        System.out.println(product3.getName() + ":" + product3.total(2)); 

        
        totalBelanjaan();
    }
}