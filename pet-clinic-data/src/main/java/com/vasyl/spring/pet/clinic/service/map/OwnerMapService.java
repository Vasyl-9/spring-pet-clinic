package com.vasyl.spring.pet.clinic.service.map;

import com.vasyl.spring.pet.clinic.model.Owner;
import com.vasyl.spring.pet.clinic.service.CrudService;
import java.util.Set;

/**
 * @author Vasyl
 */
public class OwnerMapService extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
