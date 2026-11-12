
package kh.edu.istad.restapi.repository;

import kh.edu.istad.restapi.model.User;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserRepository {

    private final List<User> users;

    // Initialize default users
    public UserRepository() {

        users = new ArrayList<>();

        users.add(new User(
                UUID.randomUUID(),
                "Administrator",
                "admin",
                "qwer",
                true
        ));

        users.add(new User(
                UUID.randomUUID(),
                "Editor",
                "editor",
                "qwer",
                false
        ));

        users.add(new User(
                UUID.randomUUID(),
                "Chan Dara",
                "chandara",
                "qwer",
                true
        ));
    }

    // GET all users
    public List<User> selectAll() {
        return users;
    }

    // GET user by ID
    public Optional<User> selectById(UUID id) {

        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    // POST new user
    public void insert(User user) {
        users.add(user);
    }

    // DELETE user by ID
    public boolean deleteById(UUID id) {

        return users.removeIf(user -> user.getId().equals(id));
    }

}
