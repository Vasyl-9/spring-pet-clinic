package com.vasyl.spring.pet.clinic.service;

import com.vasyl.spring.pet.clinic.model.Owner;

/**
 * @author Vasyl
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
