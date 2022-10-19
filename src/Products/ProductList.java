package Products;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ProductList {


    private final Set<Product> productList = new HashSet<>();

    public ProductList(Set<Product> productList) {
        this.productList.addAll(productList);
    }

    public void addProduct(Product product) {

        try {
            if (!productList.contains(product)) {
                productList.add(product);
            } else if (product.hashCode() == productList.hashCode()) {
                throw new RuntimeException(product.getName() + " уже есть в списке покупок");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public Set<Product> getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        return "Список продуктов: " + "\n" + getProductList();
    }
}
