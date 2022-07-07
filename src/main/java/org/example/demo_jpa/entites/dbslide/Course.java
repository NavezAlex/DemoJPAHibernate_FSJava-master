package org.example.demo_jpa.entites.dbslide;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
@Table(name = "course")
public class Course {

    @Id
    @Column(name = "course_id", length = 8)
    private String id;

    @Column(name = "course_name", length = 200)
    private String name;

    @Column(name = "course_ects", columnDefinition = "DECIMAL")
    private double ects;

    @Column(name = "professor_id")
    private int professorId;

    public Course() {
    }

    public Course(String id, String name, double ects, int professorId) {
        this.id = id;
        this.name = name;
        this.ects = ects;
        this.professorId = professorId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEcts() {
        return ects;
    }

    public void setEcts(double ects) {
        this.ects = ects;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", ects=" + ects +
                ", professorId=" + professorId +
                '}';
    }
}
