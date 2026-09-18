package com.semesterPrep.semesterPrep.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name = "material")
public class model {
    @Id 
    private int id;
    private String notes;
    private String pyq;
    public String getNotes() {
        return notes;
    }
    public String getPyq() {
        return pyq;
    }
    
    
}
