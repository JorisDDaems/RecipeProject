package be.intecbrussel.recipeproject.services;

import be.intecbrussel.recipeproject.commands.IngredientCommand;
import be.intecbrussel.recipeproject.domain.Ingredient;

import java.util.Set;

public interface IngredientService {


    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand ingredientCommand);

    void deleteById(Long recipeId, Long ingredientId);
}
