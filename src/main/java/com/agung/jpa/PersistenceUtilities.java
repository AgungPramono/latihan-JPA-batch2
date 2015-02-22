/*
 * Silahkan digunakan dengan bebas / dimodifikasi
 * Dengan tetap mencantumkan nama @author dan Referensi / Source
 * Terima Kasih atas Kerjasamanya.
 */
package com.agung.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Agung Pramnono
 */
public class PersistenceUtilities {
    
    private static final EntityManagerFactory entityManagerFactory;
    
    static{
        //membuat entity manager factory
        //parameter harus sama dengan persistence unit
        //yang ada pada file persistence.xml
        entityManagerFactory = Persistence.createEntityManagerFactory("crud-jpaPU");
    }
    
    public static EntityManagerFactory getEntityManagerFactory(){
        return entityManagerFactory;
    }
}