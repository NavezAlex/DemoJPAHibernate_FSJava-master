package org.example.demo_jpa.entites.demo_db;

import javax.persistence.*;

@Entity
@Table(name = "manager")
public class Gerant {

    @Id
    @Column(name = "national_nbr")
    private int id;

    @Column(name="name", nullable = false, length = 20)
    private String nom;

    @Column(name = "firstname", nullable = false, length = 20)
    private String prenom;

    @OneToOne(mappedBy = "gerant")
    private Magasin magasinGere;

    public Gerant() {
    }

    public Gerant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Magasin getMagasinGere() {
        return magasinGere;
    }

    public void setMagasinGere(Magasin magasinGere) {
        this.magasinGere = magasinGere;
    }

}
