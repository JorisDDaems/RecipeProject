package be.intecbrussel.recipeproject.services;

import be.intecbrussel.recipeproject.commands.RecipeCommand;
import be.intecbrussel.recipeproject.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
