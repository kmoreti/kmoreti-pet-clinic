package com.moreti.kmoretipetclinic.service;

import com.moreti.kmoretipetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
