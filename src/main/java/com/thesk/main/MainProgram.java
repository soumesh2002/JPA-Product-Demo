package com.thesk.main;

import com.thesk.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainProgram {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("officePU");
        EntityManager em = emf.createEntityManager();

        try {

            em.getTransaction().begin();

            // Product product = em.find(Product.class, 4);
            // System.out.println(product.getName());

            Product P5 = new Product();
            P5.setProductID(5L);
            P5.setName("Scissors");

            em.merge(P5);

            em.getTransaction().commit();

        } finally {
            em.close();
            emf.close();
        }
    }
}
