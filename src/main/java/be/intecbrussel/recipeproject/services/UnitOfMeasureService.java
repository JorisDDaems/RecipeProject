package be.intecbrussel.recipeproject.services;

import be.intecbrussel.recipeproject.commands.UnitOfMeasureCommand;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();

}

