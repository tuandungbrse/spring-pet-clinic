package com.guru.springpetclinic.services;

import com.guru.springpetclinic.models.Owner;
import com.guru.springpetclinic.models.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
