import Products.BookOfRecipes;
import Products.Product;
import Products.ProductList;
import Products.Recipe;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Product tomato = new Product("Помидор", 180, 1);
        Product cucumber = new Product("Огурец", 275, 1);
        Product salt = new Product("Соль", 300, 1);
        Product sourCream = new Product("Сметана", 150, 1);
        Product cabbage = new Product("Капуста", 200, 1);
        Product chicken = new Product("Курица", 300, 1);
        Product pepper = new Product("Перец", 200, 1);
        Product greenBean = new Product("Фасоль", 100, 1);


        ProductList productList = new ProductList(new HashSet<>());

        productList.addProduct(tomato);
//        productList.addProduct(tomato);
        productList.addProduct(cucumber);
        productList.addProduct(salt);
        productList.addProduct(sourCream);
        productList.addProduct(cabbage);

        productList.removeProduct(salt);

        System.out.println(productList.toString().replace("[", "").replace("]", "").replace(", ", ""));





        Recipe salad = new Recipe(Map.ofEntries(Map.entry(tomato, 2.0), Map.entry(cucumber, 0.5), Map.entry(cabbage, 0.5), Map.entry(salt, 0.1)), "Овощной салат");

        Recipe salad2 = new Recipe(Map.ofEntries(
                Map.entry(tomato, 1.25),
                Map.entry(cucumber, 0.5),
                Map.entry(cabbage, 0.5),
                Map.entry(salt, 0.1),
                Map.entry(sourCream, 0.2)), "Овощной салат со сметаной 2");

        Recipe soup = new Recipe(Map.ofEntries(
                Map.entry(salt, 0.2),
                Map.entry(cabbage, 1.0),
                Map.entry(chicken, 1.0),
                Map.entry(pepper, 0.5),
                Map.entry(greenBean, 0.3)), "Овощной суп с курицей");



        BookOfRecipes firstBookOfRecipes = new BookOfRecipes(new HashSet<>());

        firstBookOfRecipes.addRecipe(salad);
//        firstBookOfRecipes.addRecipe(salad);
        firstBookOfRecipes.addRecipe(salad2);
        firstBookOfRecipes.addRecipe(soup);

        System.out.println(firstBookOfRecipes.toString().replace("[", "").replace("]", "").replace(", ", ""));

//        Set<Integer> exercise2 = new HashSet<>();
//
//        for (int i = 0; i < 20; i++) {
//            exercise2.add(getRandomNum());
//        }
//
//        Iterator<Integer> iterator = exercise2.iterator();
//
//        while (iterator.hasNext()) {
//            int element = iterator.next();
//            if (element % 2 != 0) {
//                iterator.remove();
//            }
//        }
//
//
//
//        System.out.println(exercise2);
//

        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Иванов Иван", "+79095759434");
        phoneBook.put("Иванов Павел", "+79095729434");
        phoneBook.put("Иванов Никитиа", "+79095759434");
        phoneBook.put("Иванов Владимир", "+79395759434");
        phoneBook.put("Иванова Мария", "+79095759434");
        phoneBook.put("Иванов Роман", "+79095754434");
        phoneBook.put("Сидоров Иван", "+79099559434");
        phoneBook.put("Шепелев Иван", "+79095759434");
        phoneBook.put("Узлов Никита", "+79047532434");
        phoneBook.put("Клемков Павел", "+7932576994");

        System.out.println(phoneBook.values());

        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry);
        }
        // Не понял что имеется ввиду вывести все "значения", поэтому вывел и так и так


        Exercise3 exercise3 = new Exercise3(Map.ofEntries(Map.entry("A", 1), Map.entry("B", 2), Map.entry("C", 3)));
        exercise3.addToMap("D", 4);
//        exercise3.addToMap("A", 1);
        exercise3.addToMap("A", 9);
        System.out.println(exercise3);


        Map<String, List<Integer>> exercise1 = new HashMap<>();
        exercise1.put("Первое", new ArrayList<>(List.of(getRandomNum(), getRandomNum(), getRandomNum())));
        exercise1.put("Второе", new ArrayList<>(List.of(getRandomNum(), getRandomNum(), getRandomNum())));
        exercise1.put("Третье", new ArrayList<>(List.of(getRandomNum(), getRandomNum(), getRandomNum())));

        Map<String, Integer> exercise1Copy = new HashMap<>();

        for (Map.Entry<String, List<Integer>> entry : exercise1.entrySet()) {
            exercise1Copy.put(entry.getKey(), takeSumOfList(entry.getValue()));
        }

        System.out.println(exercise1);
        System.out.println(exercise1Copy);

        Map<Integer, String> exercise2 = new HashMap<>();
        exercise2.put(1, "Один");
        exercise2.put(2, "Два");
        exercise2.put(3, "Три");
        exercise2.put(4, "Четрые");
        exercise2.put(5, "Пять");
        exercise2.put(6, "Шесть");

        for (Map.Entry<Integer, String> entry : exercise2.entrySet()) {
            System.out.println(entry);
        }




    }

    public static int getRandomNum() {
        return (int) (Math.random() * 1001);
    }

    public static int takeSumOfList (List<Integer> integers) {
        int sum = 0;
        for (Integer arrayList : integers ) {
            sum = sum + arrayList;
        }

        return sum;
    }
}