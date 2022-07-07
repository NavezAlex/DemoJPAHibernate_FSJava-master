package org.example.demo_jpa.entites.dbslide;

import javax.persistence.*;

//@Entity
@Table(name = "professor")
public class Professor {

    @Id
    @Column(name = "professor_id", columnDefinition = "INT")
    private long id;
    @Column(name = "professor_name", length = 30)
    private String name;
    @Column(name = "professor_surname", nullable = false)
    private String firstname;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
