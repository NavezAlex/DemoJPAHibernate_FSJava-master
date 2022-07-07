package org.example.demo_jpa.entites.repository;

import org.example.demo_jpa.entites.demo_db.Produit;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ProduitRepository {

    private final EntityManager manager;

    public ProduitRepository(EntityManager manager) {
        this.manager = manager;
    }

    public void insert(Produit p){
        manager.getTransaction().begin();
        manager.persist(p);
        manager.getTransaction().commit();
    }

    public Produit getOne(long id){
        Produit p = manager.find(Produit.class, id);
        manager.detach(p);
        return p;
    }

    public List<Produit> getAll(){
        TypedQuery<Produit> query = manager.createQuery("SELECT p FROM Produit p", Produit.class);
        List<Produit> produits = query.getResultList();
        manager.clear();
        return produits;
    }

    public void update(Produit toUpdate){
        manager.getTransaction().begin();
        manager.merge(toUpdate);
        manager.getTransaction().commit();
    }

    public Produit delete(long id){
        manager.getTransaction().begin();
        Produit p = manager.find(Produit.class, id);
        manager.remove(p);
        manager.getTransaction().commit();
        return p;
    }

}
