package com.thesk.jpapro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("officePU");
        EntityManager em = emf.createEntityManager();

        // persistenceUnitName: unique name for persistence unit

        try {
            em.getTransaction().begin();
            /**
             * describe the database
             */

            em.getTransaction().commit();

        } finally {

            em.close();
        }
    }
}
