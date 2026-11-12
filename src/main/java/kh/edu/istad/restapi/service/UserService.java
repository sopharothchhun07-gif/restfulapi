
package kh.edu.istad.restapi.service;

import kh.edu.istad.restapi.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    // Get all users
    List<User> getAll();

    // Get user by ID
    User getById(UUID id);

    // Insert new user
    User insert(User user);

    // Delete user by ID
    void deleteById(UUID id);

}
