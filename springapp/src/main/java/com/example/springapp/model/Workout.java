package com.example.springapp.model;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



@Entity
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @NotNull(message = "Date is required")
    private LocalDate date; 

    @NotBlank(message = "Duration is required")
    @Size(max = 100, message = "Duration must be a maximum of 100 characters")
    private String duration;

    @Size(max = 500, message = "Notes must be a maximum of 500 characters")
    private String notes;

    public Workout(long id, User user, LocalDate date, String duration, String notes) {
        this.id = id;
        this.user = user;
        this.date = date;
        this.duration = duration;
        this.notes = notes;
    }
    public Workout() {
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

   

   
}
