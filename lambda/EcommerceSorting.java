import java.util.*;

class Product {
    String name;
    double price, rating, discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount;
    }
}

public class EcommerceSorting {
    public static void main(String[] args) {
        List<Product> list = Arrays.asList(
            new Product("Laptop", 80000, 4.6, 10),
            new Product("Phone", 30000, 4.2, 25),
            new Product("Watch", 5000, 3.9, 15)
        );

        // Sort by Price
        list.sort((a, b) -> Double.compare(a.price, b.price));
        System.out.println("Sorted by Price:");
        list.forEach(System.out::println);

        // Sort by Rating
        list.sort((a, b) -> Double.compare(b.rating, a.rating));
        System.out.println("\nSorted by Rating:");
        list.forEach(System.out::println);

        // Sort by Discount
        list.sort((a, b) -> Double.compare(b.discount, a.discount));
        System.out.println("\nSorted by Discount:");
        list.forEach(System.out::println);
    }
}
