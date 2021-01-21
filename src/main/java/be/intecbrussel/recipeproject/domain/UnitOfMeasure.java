package be.intecbrussel.recipeproject.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UnitOfMeasure {

    @Id
    private Long id;
    private String unitOfMeasure;
}
