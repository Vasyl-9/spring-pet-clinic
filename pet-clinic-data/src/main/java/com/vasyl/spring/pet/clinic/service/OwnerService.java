package com.vasyl.spring.pet.clinic.service;

import com.vasyl.spring.pet.clinic.model.Owner;
import java.util.Set;

/**
 * @author Vasyl
 */
public interface OwnerService {

    Owner findById(Long id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
