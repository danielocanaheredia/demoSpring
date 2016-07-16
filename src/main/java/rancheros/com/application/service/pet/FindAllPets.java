package rancheros.com.application.service.pet;

import rancheros.com.domain.pet.Pet;
import rancheros.com.domain.pet.PetRepository;
import java.util.List;

/**
 * Created by Daniel on 04/07/2016.
 */
public class FindAllPets {


    private PetRepository repository;

    public FindAllPets(PetRepository repository) {
        this.repository = repository;
    }

    public List<Pet> findAll (){
        return repository.findAll();
    }
}