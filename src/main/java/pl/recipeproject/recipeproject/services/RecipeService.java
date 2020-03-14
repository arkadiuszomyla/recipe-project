package pl.recipeproject.recipeproject.services;

import pl.recipeproject.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
