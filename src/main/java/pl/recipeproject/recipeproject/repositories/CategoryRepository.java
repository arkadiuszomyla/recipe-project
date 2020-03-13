package pl.recipeproject.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.recipeproject.recipeproject.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
