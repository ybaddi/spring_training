package com.example.example_17.entities;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;
    private String nom;
    private String prenom;

    @ManyToMany(cascade = {CascadeType.ALL},
            fetch = FetchType.EAGER
    )
    private List<Adress> adress = new ArrayList<>();


//    public Personne() {
//        // TODO Auto-generated constructor stub
//    }

//    public Personne(String nom, String prenom) {
//        this.nom = nom;
//        this.prenom = prenom;
//    }

//    public Long getNum() {
//        return num;
//    }
//
//    public void setNum(Long num) {
//        this.num = num;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//
//    public void setNom(String nom) {
//        this.nom = nom;
//    }
//
//    public String getPrenom() {
//        return prenom;
//    }
//
//    public void setPrenom(String prenom) {
//        this.prenom = prenom;
//    }
//
//    public List<Adress> getAdress() {
//        return adress;
//    }
//
//    public void setAdress(List<Adress> adresses) {
//        this.adress = adresses;
//    }
//
//    @Override
//    public String toString() {
//        return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", adresses=" + adress + "]";
//    }
}