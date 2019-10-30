package com.moreti.kmoretipetclinic.service;

import com.moreti.kmoretipetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
