package com.vasyl.spring.pet.clinic.service;

import com.vasyl.spring.pet.clinic.model.Pet;
import java.util.Set;

/**
 * @author Vasyl
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
