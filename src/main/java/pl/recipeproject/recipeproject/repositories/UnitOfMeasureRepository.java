package pl.recipeproject.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.recipeproject.recipeproject.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String desription);
}
