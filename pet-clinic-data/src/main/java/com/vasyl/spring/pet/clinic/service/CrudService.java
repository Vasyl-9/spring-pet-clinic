package com.vasyl.spring.pet.clinic.service;

import java.util.Set;

/**
 * @author Vasyl
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
