package com.vasyl.spring.pet.clinic.service.map;

import com.vasyl.spring.pet.clinic.model.Pet;
import com.vasyl.spring.pet.clinic.service.CrudService;

import java.util.Set;

/**
 * @author Vasyl
 */
public class PetMapService extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

