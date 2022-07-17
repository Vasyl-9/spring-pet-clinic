package com.vasyl.spring.pet.clinic.service;

import com.vasyl.spring.pet.clinic.model.Vet;
import java.util.Set;

/**
 * @author Vasyl
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
