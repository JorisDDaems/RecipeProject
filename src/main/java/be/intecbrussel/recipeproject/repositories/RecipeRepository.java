package be.intecbrussel.recipeproject.repositories;

import be.intecbrussel.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
