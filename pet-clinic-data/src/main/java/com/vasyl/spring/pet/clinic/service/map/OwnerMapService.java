package com.vasyl.spring.pet.clinic.service.map;

import com.vasyl.spring.pet.clinic.model.Owner;
import com.vasyl.spring.pet.clinic.service.OwnerService;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 * @author Vasyl
 */
@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

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

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
