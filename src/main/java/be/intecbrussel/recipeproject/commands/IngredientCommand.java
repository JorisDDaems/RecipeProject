package be.intecbrussel.recipeproject.commands;

import be.intecbrussel.recipeproject.domain.Recipe;
import be.intecbrussel.recipeproject.domain.UnitOfMeasure;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.net.ssl.SSLSession;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {


    private Long id;
    private Long recipeId;
    private String description;
    private UnitOfMeasureCommand uom;
    private BigDecimal amount;


}
