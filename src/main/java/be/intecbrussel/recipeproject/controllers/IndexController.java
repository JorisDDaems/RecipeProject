package be.intecbrussel.recipeproject.controllers;

import be.intecbrussel.recipeproject.domain.Category;
import be.intecbrussel.recipeproject.domain.UnitOfMeasure;
import be.intecbrussel.recipeproject.repositories.CategoryRepository;
import be.intecbrussel.recipeproject.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/","/index"})
    public String getIndexPage(){
        System.out.println("some message to say.. ");

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptinal = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat id is: " + categoryOptional.get().getId());
        System.out.println("uom id is: " + unitOfMeasureOptinal.get().getId());

        return "index";
    }

}
