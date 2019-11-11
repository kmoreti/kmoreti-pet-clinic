package com.moreti.kmoretipetclinic.services.map;

import com.moreti.kmoretipetclinic.model.Owner;
import com.moreti.kmoretipetclinic.services.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {

    private OwnerService ownerService;
    private final Long ownerId = 1L;
    private final String lastName = "Smith";

    @BeforeEach
    void setUp() {
        ownerService = new OwnerMapService(new PetMapService(), new PetTypeMapService());
        ownerService.save(Owner.builder().id(ownerId).lastName(lastName).build());
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerService.findAll();
        assertEquals(1, ownerSet.size());
    }

    @Test
    void findById() {
        Owner owner = ownerService.findById(ownerId);
        assertEquals(ownerId, owner.getId());
    }

    @Test
    void deleteById() {
        ownerService.deleteById(ownerId);
        assertEquals(0,ownerService.findAll().size());
    }

    @Test
    void delete() {
        ownerService.delete(ownerService.findById(ownerId));
        assertEquals(0,ownerService.findAll().size());
    }

    @Test
    void saveExistingId() {
        long id = 2L;

        Owner owner2 = Owner.builder().id(id).build();

        ownerService.save(owner2);
    }

    @Test
    void saveNoId() {
        Owner savedOwner = ownerService.save(Owner.builder().build());
        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Test
    void findByLastName() {
        Owner owner = ownerService.findByLastName(lastName);
        assertNotNull(owner);
        assertEquals(ownerId, owner.getId());
    }

    @Test
    void findByLastNameNotFound() {
        Owner owner = ownerService.findByLastName("foo");
        assertNull(owner);
    }
}