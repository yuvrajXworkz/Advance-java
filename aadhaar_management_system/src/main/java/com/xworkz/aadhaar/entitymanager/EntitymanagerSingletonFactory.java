package com.xworkz.aadhaar.entitymanager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntitymanagerSingletonFactory {

    private  static EntityManagerFactory factory=null;

    public  static EntityManagerFactory getFactory()
    {
        return  factory;
    }
    static {
        factory= Persistence.createEntityManagerFactory("com.xworkz");
    }
}
