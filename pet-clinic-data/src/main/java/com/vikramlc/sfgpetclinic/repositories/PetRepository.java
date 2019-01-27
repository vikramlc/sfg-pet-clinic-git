package com.vikramlc.sfgpetclinic.repositories;

import com.vikramlc.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
