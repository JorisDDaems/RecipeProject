package be.intecbrussel.recipeproject.repositories;

import be.intecbrussel.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
