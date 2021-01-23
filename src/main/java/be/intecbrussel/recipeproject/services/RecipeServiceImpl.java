package be.intecbrussel.recipeproject.services;

import be.intecbrussel.recipeproject.domain.Recipe;
import be.intecbrussel.recipeproject.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {

        Set<Recipe> recipes = new HashSet<>();

        recipeRepository.findAll().forEach(recipes::add);

        return recipes;
    }
}
