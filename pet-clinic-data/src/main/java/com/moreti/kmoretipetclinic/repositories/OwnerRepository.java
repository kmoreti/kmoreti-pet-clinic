package com.moreti.kmoretipetclinic.repositories;

import com.moreti.kmoretipetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner finByLastName(String lastName);
}
