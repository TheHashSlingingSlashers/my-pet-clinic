package com.bca.spring.mypetclinic.services;

import com.bca.spring.mypetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
