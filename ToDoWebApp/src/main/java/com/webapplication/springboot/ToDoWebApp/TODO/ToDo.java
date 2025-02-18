package com.webapplication.springboot.ToDoWebApp.TODO;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ToDo {
    private int id;
    private String username;
    @NotBlank(message = "Description cannot be empty")
    @Size(min = 10, message = "Description must be at least 10 characters long")
    private String description;
    private LocalDate trackDate;
    private boolean done;

    public ToDo(int id, String username, String description, LocalDate trackDate, boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.trackDate = trackDate;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTrackDate() {
        return trackDate;
    }

    public void setTrackDate(LocalDate trackDate) {
        this.trackDate = trackDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "ToDo [id=" + id + ", username=" + username + ", description=" + description + ", trackDate=" + trackDate + ", done=" + done + "]";
    }
}
