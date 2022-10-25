package com.bca.spring.mypetclinic.services;

import com.bca.spring.mypetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet owner);
    Set<Pet> findAll();
}
