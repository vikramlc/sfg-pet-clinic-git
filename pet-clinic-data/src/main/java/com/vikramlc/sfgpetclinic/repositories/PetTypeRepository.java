package com.vikramlc.sfgpetclinic.repositories;

import com.vikramlc.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
