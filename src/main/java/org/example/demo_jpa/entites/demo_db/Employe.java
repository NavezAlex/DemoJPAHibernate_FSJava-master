package org.example.demo_jpa.entites.demo_db;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Employe {

    @Id
    @Column(name = "national_nbr")
    private int id;

    @Column(
            name = "employe_name",
            nullable = false,
            length = 20,
            unique = true
    )
    private String nom;

    @Column(name = "employe_firstname", nullable = false, length = 20)
    private String prenom;

    // Je ne suis pas obligé d'utiliser @Column
    private LocalDate dateNaiss;

    @ManyToMany(mappedBy = "employes")
    private List<Magasin> magasins;


}
