package com.bca.spring.mypetclinic.services;

import com.bca.spring.mypetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();
}
