package com.vasyl.spring.pet.clinic.model;

import java.io.Serializable;

/**
 * @author Vasyl
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
