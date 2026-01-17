import java.util.*;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(101, "laptop", 450000));
        products.add(new Product(102, "phone", 250000));
        products.add(new Product(103, "mouse", 5000));
        products.add(new Product(104, "keyboard", 15000));

        System.out.println("showing all products");
        for (Product p : products) {
            System.out.println(p);
        }

        System.out.println("\nsearching for phone");
        for (Product p : products) {
            if (p.getName().equals("phone")) {
                System.out.println("found it: " + p);
            }
        }

        System.out.println("\nfilter: price higher than 100000");
        for (Product p : products) {
            if (p.getPrice() > 100000) {
                System.out.println(p);
            }
        }

        System.out.println("\nsorting by price (low to high)");
        products.sort(Comparator.comparingDouble(Product::getPrice));
        for (Product p : products) {
            System.out.println(p);
        }

        System.out.println("\nchecking order info");
        Shopper customer = new Shopper(1, "aruzhan");
        Order myOrder = new Order(501, products.get(0), customer);
        myOrder.printOrderInfo();

        ProductDAO productDAO = new ProductDAO();
        ShopperDAO shopperDAO = new ShopperDAO();

        for (Product p : products) {
            productDAO.add(p);
        }
        shopperDAO.add(customer);

        System.out.println("\nProducts from database:");
        for (Product p : productDAO.getAll()) {
            System.out.println(p);
        }

        productDAO.updatePrice(102, 230000);
        productDAO.delete(103);
    }
}