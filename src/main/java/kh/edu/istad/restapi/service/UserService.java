
package kh.edu.istad.restapi.service;

import kh.edu.istad.restapi.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    // GET all users
    List<User> getAll();

    // GET user by ID
    User getById(UUID id);

    // POST new user
    User insert(User user);

    // DELETE user by ID
    void deleteById(UUID id);

}
