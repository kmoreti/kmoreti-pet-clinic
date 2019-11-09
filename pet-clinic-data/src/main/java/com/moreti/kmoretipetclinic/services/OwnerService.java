package com.moreti.kmoretipetclinic.services;

import com.moreti.kmoretipetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
