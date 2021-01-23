package be.intecbrussel.recipeproject.services;

import be.intecbrussel.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
