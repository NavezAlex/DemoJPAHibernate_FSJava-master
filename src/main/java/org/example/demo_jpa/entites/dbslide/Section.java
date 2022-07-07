package org.example.demo_jpa.entites.dbslide;

import javax.persistence.*;
import java.util.List;

//@Entity
@Table(name = "section")
public class Section
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name = "section_id")
    private int sectionId;
    @Column(name = "section_name")
    private String sectionName;
    @Column(name = "delegate_id", columnDefinition = "INT")
    private long delegateId;

    @OneToMany(mappedBy = "section")
    private List<Professor> professors;

    public Section() {
    }

    public Section(int section_id, String section_name, long delegate_id) {
        this.sectionId = section_id;
        this.sectionName = section_name;
        this.delegateId = delegate_id;
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public long getDelegateId() {
        return delegateId;
    }

    public void setDelegateId(long delegateId) {
        this.delegateId = delegateId;
    }
}
