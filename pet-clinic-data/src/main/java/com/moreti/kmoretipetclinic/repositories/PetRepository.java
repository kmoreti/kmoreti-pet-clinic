package com.moreti.kmoretipetclinic.repositories;

import com.moreti.kmoretipetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
