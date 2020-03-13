package pl.recipeproject.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.recipeproject.recipeproject.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
