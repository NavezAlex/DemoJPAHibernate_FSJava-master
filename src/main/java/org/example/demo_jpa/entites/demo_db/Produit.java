package org.example.demo_jpa.entites.demo_db;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "product")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", columnDefinition = "INT")
    private long id;

    @Column(nullable = false, length = 40)
    private String nom;

    @Column(nullable = false, length = 40)
    private String marque;

    @Column(name = "product_peremption")
    private LocalDate peremption;

    @ManyToMany(mappedBy = "produitsDisponibles")
    private List<Magasin> disponibleDans;

    public Produit(long id, String nom, String marque) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
    }

    public Produit() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public List<Magasin> getDisponibleDans() {
        return disponibleDans;
    }

    public void setDisponibleDans(List<Magasin> disponibleDans) {
        this.disponibleDans = disponibleDans;
    }
}
