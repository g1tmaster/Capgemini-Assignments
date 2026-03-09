package com.capgemini.capgemini;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class PersonMain {

     public static void main(String[] args) {
         EntityManagerFactory emf =
                 Persistence.createEntityManagerFactory("personPU");

         EntityManager em = emf.createEntityManager();

         em.getTransaction().begin();

         Dl dl = new Dl();
         dl.setIssueDate(LocalDate.of(2020, 5, 10));
         dl.setExpDate(LocalDate.of(2030, 5, 10));
         dl.setType("LMV");

         Person p = new Person("Chintu", LocalDate.of(2002, 12, 3));
         p.setDl(dl);

         em.persist(dl);
         em.persist(p);

         em.getTransaction().commit();

         em.close();
         emf.close();

    }
}
