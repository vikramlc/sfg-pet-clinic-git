package com.vikramlc.sfgpetclinic.services;

import com.vikramlc.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
