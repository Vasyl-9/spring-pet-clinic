package com.vasyl.spring.pet.clinic.service.map;

import com.vasyl.spring.pet.clinic.model.Pet;
import com.vasyl.spring.pet.clinic.service.PetService;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 * @author Vasyl
 */
@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

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

