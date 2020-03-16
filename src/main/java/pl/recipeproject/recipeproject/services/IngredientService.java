package pl.recipeproject.recipeproject.services;

import org.springframework.stereotype.Service;
import pl.recipeproject.recipeproject.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
