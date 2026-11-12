
package kh.edu.istad.restapi.model;

import java.util.UUID;

public class User {

    private UUID id;
    private String name;
    private String username;
    private String password;
    private boolean isActive;

    // Default constructor
    public User() {
    }

    // Constructor
    public User(UUID id, String name, String username,
                String password, boolean isActive) {

        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.isActive = isActive;
    }

    // Getters
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return isActive;
    }

    // Setters
    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

}
