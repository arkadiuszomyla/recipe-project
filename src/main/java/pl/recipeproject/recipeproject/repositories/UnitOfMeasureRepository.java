package pl.recipeproject.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.recipeproject.recipeproject.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
