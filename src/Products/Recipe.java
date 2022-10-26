package Products;

import java.util.*;
import java.util.Map.Entry;

public class Recipe {

    private final Map<Product, Double> products = new HashMap<>();
    private final double sumCost;
    private final String name;

    public Recipe(Map<Product, Double> products, String name) {
        this.products.putAll(products);
        this.sumCost = findRecipeSumCost(products);
        this.name = name;
    }

    public Map<Product, Double> getProducts() {
        return products;
    }

    public double getSumCost() {
        return sumCost;
    }

    public String getName() {
        return name;
    }
    public String getInfoProduct() {
        StringBuilder builder = new StringBuilder();
        for (Entry<Product, Double> entry : products.entrySet()) {
            builder.append(entry.getKey()).append("Нам необходимо ");
            builder.append(entry.getValue()).append(" кг.\n");
        }
        return builder.toString();
    }

    public double findRecipeSumCost(Map<Product, Double> products) {
        double sum = 0.0;
        for (Entry<Product, Double> entry : products.entrySet()) {
            sum = sum + entry.getKey().getCost() * entry.getValue();
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
        return name + ". В состав блюда входят:" + "\n" + getInfoProduct() + "Цена блюда оставляет - " + sumCost + " рублей." + "\n" + "\n";
    }
}
