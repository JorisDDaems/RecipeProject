package be.intecbrussel.recipeproject.services;

import be.intecbrussel.recipeproject.converters.RecipeCommandToRecipe;
import be.intecbrussel.recipeproject.converters.RecipeToRecipeCommand;
import be.intecbrussel.recipeproject.domain.Recipe;
import be.intecbrussel.recipeproject.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Mock
    RecipeToRecipeCommand recipeToRecipeCommand;

    @Mock
    RecipeCommandToRecipe recipeCommandToRecipe;

    @BeforeEach
    void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);

        recipeService = new RecipeServiceImpl(recipeRepository, recipeCommandToRecipe, recipeToRecipeCommand);
    }



    @Test
    void getRecipes() throws Exception {

        Recipe recipe = new Recipe();
        HashSet recipesData = new HashSet();
        recipesData.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipesData);

        Set<Recipe> recipeSet = recipeService.getRecipes();

        assertEquals(recipeSet.size(),1);
        verify(recipeRepository, times(1)).findAll();

    }

    @Test
    void findById() {

            Recipe recipe = new Recipe();
            recipe.setId(1L);
            Optional<Recipe> recipeOptional = Optional.of(recipe);

            when(recipeRepository.findById(anyLong())).thenReturn(recipeOptional);

            Recipe recipeReturned = recipeService.findById(1L);

            assertNotNull(recipeReturned,"Null recipe returned");
            verify(recipeRepository, times(1)).findById(anyLong());
            verify(recipeRepository, never()).findAll();

    }
}