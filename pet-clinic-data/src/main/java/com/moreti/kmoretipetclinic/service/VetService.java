package com.moreti.kmoretipetclinic.service;

import com.moreti.kmoretipetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
