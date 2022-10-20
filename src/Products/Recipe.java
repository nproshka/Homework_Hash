package Products;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private final Set<Product> products = new HashSet<>();
    private final int sumCost;
    private final String name;

    public Recipe(Set<Product> products, String name) {
        this.products.addAll(products);
        this.sumCost = findRecipeSumCost(products);
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public int getSumCost() {
        return sumCost;
    }

    public String getName() {
        return name;
    }

    public int findRecipeSumCost(Set<Product> products) {
        int sum = 0;
        for (Product product1: products) {
            sum = sum + product1.getCost();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return name.equals(recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + ". В состав блюда входят:" + "\n" + products + "Цена блюда оставляет - " + sumCost + " рублей." + "\n" + "\n";
    }
}
