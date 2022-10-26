package Products;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BookOfRecipes {

    private final Set<Recipe> bookOfRecipes = new HashSet<>();

    public BookOfRecipes(Set<Recipe> recipes) {
        this.bookOfRecipes.addAll(recipes);
    }

    public void addRecipe(Recipe recipe) {

            if (!bookOfRecipes.contains(recipe)) {
                bookOfRecipes.add(recipe);
            } else {
                throw new RuntimeException(recipe.getName() + " уже есть в книге рецептов");
            }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookOfRecipes that = (BookOfRecipes) o;
        return bookOfRecipes.equals(that.bookOfRecipes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookOfRecipes);
    }

    public void removeRecipe(Recipe recipe) {
        bookOfRecipes.remove(recipe);
    }

    public Set<Recipe> getBookOfRecipes() {
        return bookOfRecipes;
    }



    @Override
    public String toString() {
        return "Список рецептов:" + "\n" + "\n" + getBookOfRecipes();
    }

}
