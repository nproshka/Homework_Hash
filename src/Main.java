import Products.BookOfRecipes;
import Products.Product;
import Products.ProductList;
import Products.Recipe;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Product tomato = new Product("Помидор", 180, 0.25);
        Product cucumber = new Product("Огурец", 275, 0.7);
        Product salt = new Product("Соль", 300, 1);
        Product sourCream = new Product("Сметана", 150, 0.5);
        Product cabbage = new Product("Капуста", 200, 1);
        Product chicken = new Product("Курица", 300, 1);
        Product pepper = new Product("Перец", 200, 1);
        Product greenBean = new Product("Фасоль", 100, 0.3);


        ProductList productList = new ProductList(new HashSet<>());

        productList.addProduct(tomato);
        productList.addProduct(tomato);
        productList.addProduct(cucumber);
        productList.addProduct(salt);
        productList.addProduct(sourCream);
        productList.addProduct(cabbage);

        productList.removeProduct(salt);

        System.out.println(productList.toString().replace("[", "").replace("]", "").replace(", ", ""));





        Recipe salad = new Recipe(new HashSet<>(List.of(tomato, cucumber, salt, sourCream, cabbage)), "Овощной салат со сметаной");
        Recipe salad2 = new Recipe(new HashSet<>(List.of(tomato, cucumber, salt, sourCream, cabbage)), "Овощной салат со сметаной 2");
        Recipe soup = new Recipe(new HashSet<>(List.of(cabbage, salt, chicken, pepper, greenBean)), "Овощной суп с курицей");



        BookOfRecipes firstBookOfRecipes = new BookOfRecipes(new HashSet<>());

        firstBookOfRecipes.addRecipe(salad);
        firstBookOfRecipes.addRecipe(salad);
        firstBookOfRecipes.addRecipe(salad2);
        firstBookOfRecipes.addRecipe(soup);

        System.out.println(firstBookOfRecipes.toString().replace("[", "").replace("]", "").replace(", ", ""));


        Set<Integer> exercise2 = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            exercise2.add(getRandomNum());
        }

        Iterator<Integer> iterator = exercise2.iterator();

        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element % 2 != 0) {
                iterator.remove();
            }
        }



        System.out.println(exercise2);



    }

    public static int getRandomNum() {
        return (int) (Math.random() * 1001);
    }
}