package com.example.meditake.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class Patient extends Utilisateur{
    @PrimaryKey
    private Long id;

    public Patient(String prenom, String nom, String motDePasse) {
        super(prenom, nom, motDePasse);
    }

    public Patient() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}