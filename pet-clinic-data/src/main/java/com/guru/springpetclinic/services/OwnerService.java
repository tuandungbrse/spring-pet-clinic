package com.guru.springpetclinic.services;

import com.guru.springpetclinic.models.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}
