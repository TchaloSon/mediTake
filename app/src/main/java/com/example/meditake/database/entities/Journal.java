package com.example.meditake.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Journal {
    @PrimaryKey
    private int id;

    private String message;

    private int rappelId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRappelId() {
        return rappelId;
    }

    public void setRappelId(int rappelId) {
        this.rappelId = rappelId;
    }
}
