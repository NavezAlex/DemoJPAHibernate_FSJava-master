package org.example.demo_jpa;

import org.example.demo_jpa.entites.dbslide.Course;
import org.example.demo_jpa.entites.dbslide.Section;
import org.example.demo_jpa.entites.demo_db.Magasin;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
        EntityManager em = emf.createEntityManager();

        // Transaction:
        // begin - lance la transaction (on travaille avec les données de debut de transaction)
        // commit - valide et met en application les modifications
        // rollback - retour à l'état d'avant la transaction


        // INSERT
        em.getTransaction().begin();

        Magasin pasGere =
                new Magasin("mon autre magassin", "mon autre adresse");
        em.persist(pasGere);

        em.getTransaction().commit();

//        Magasin gere = em.find(Magasin.class, 1);
//
//        em.remove( gere );
//        em.flush();

        // New/Transient || Detached
        // Managed
        // Removed


        em.close();
        emf.close();

    }

}
