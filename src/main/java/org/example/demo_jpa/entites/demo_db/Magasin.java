package org.example.demo_jpa.entites.demo_db;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "magasin")
public class Magasin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "store_id")
    private long id;

    @Column(name = "store_name", nullable = false, length = 40)
    private String nom;

    @Column(name = "store_address", length = 200)
    private String adresse;

    @OneToOne
    @JoinColumn(
            name = "gerant_id",
            unique = true,
//            nullable = false,
            foreignKey = @ForeignKey(name = "FK_magasin_gerant_id")
    )
    private Gerant gerant;

    @ManyToMany
    @JoinTable(
            name = "emploi",
            joinColumns = @JoinColumn(name = "magasin_id"),
            inverseJoinColumns = @JoinColumn(name = "employe_id"),
            foreignKey = @ForeignKey(name = "FK_emploi_magasin_id"), // permet à Hibernate de ne pas avoir à générer un nom de FK nul
            inverseForeignKey = @ForeignKey(name = "FK_emploi_employe_id")
    )
    private List<Employe> employes;

    @ManyToMany
    @JoinTable(
            name = "EnVente",
            joinColumns = @JoinColumn(name = "magasin_id"),
            inverseJoinColumns = @JoinColumn(name = "produit_id")
    )
    private List<Produit> produitsDisponibles;

    public Magasin() {
    }

    public Magasin(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Gerant getGerant() {
        return gerant;
    }

    public void setGerant(Gerant gerant) {
        this.gerant = gerant;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public List<Produit> getProduitsDisponibles() {
        return produitsDisponibles;
    }

    public void setProduitsDisponibles(List<Produit> produitsDisponibles) {
        this.produitsDisponibles = produitsDisponibles;
    }
}
