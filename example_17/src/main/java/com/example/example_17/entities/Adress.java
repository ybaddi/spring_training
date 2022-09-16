package com.example.example_17.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rue;
    private String codePostal;
    private String ville;


    public Adress() {
        super();
    }
    public Adress(String rue, String codePostal, String ville) {
        super();
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
    public Adress(Long id, String rue, String codePostal, String ville) {
        super();
        this.id = id;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRue() {
        return rue;
    }
    public void setRue(String rue) {
        this.rue = rue;
    }
    public String getCodePostal() {
        return codePostal;
    }
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    @Override
    public String toString() {
        return "Adress [id=" + id + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + "]";
    }



}
