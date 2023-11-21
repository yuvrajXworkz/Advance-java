package com.xworkz.aadhaar.repository;

import com.xworkz.aadhaar.dto.PersonDto;
import com.xworkz.aadhaar.entitymanager.EntitymanagerSingletonFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class AdhaarRepositoryImpl implements  AdhaarRepository{
    @Override
    public void add(PersonDto dto) {
        EntityManager entityManager = EntitymanagerSingletonFactory.getFactory().createEntityManager();
        EntityTransaction et = entityManager.getTransaction();
        entityManager.getTransaction().begin();
        entityManager.clear();
        entityManager.merge(dto);
        entityManager.getTransaction().commit();
    }
}
