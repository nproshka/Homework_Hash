import Products.Product;
import Products.ProductList;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Product tomato = new Product("Помидор", 180, 0.25);
        Product cucumber = new Product("Огурец", 275, 0.7);
        Product salt = new Product("Соль", 300, 1);
        Product sourCream = new Product("Сметана", 150, 0.5);
        Product cabbage = new Product("Капуста", 300, 1);

        ProductList productList = new ProductList(new HashSet<>());

        productList.addProduct(tomato);
        productList.addProduct(tomato);
        productList.addProduct(cucumber);
        productList.addProduct(salt);
        productList.addProduct(sourCream);
        productList.addProduct(cabbage);

        productList.removeProduct(salt);

        System.out.println(productList.toString().replace("[", "").replace("]", "").replace(", ", ""));



    }
}