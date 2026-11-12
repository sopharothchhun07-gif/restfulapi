
package kh.edu.istad.restapi.model;

import java.util.UUID;

public class User {

    private UUID id;
    private String name;
    private String username;
    private String password;
    private boolean status;

    public User(UUID id, String name, String username,
                String password, boolean status) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.status = status;
    }

    public User() {
    }

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

    public boolean isStatus() {
        return status;
    }

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

    public void setStatus(boolean status) {
        this.status = status;
    }

}
