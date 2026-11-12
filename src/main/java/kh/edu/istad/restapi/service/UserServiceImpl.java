
package kh.edu.istad.restapi.service;

import kh.edu.istad.restapi.model.User;
import kh.edu.istad.restapi.repository.UserRepository;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    // Constructor Injection
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Get all users
    @Override
    public List<User> getAll() {
        return userRepository.selectAll();
    }

    // Get user by ID
    @Override
    public User getById(UUID id) {
        return userRepository.selectById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "User not found with ID: " + id
                ));
    }

    // Insert new user
    @Override
    public User insert(User user) {

        user.setId(UUID.randomUUID());

        userRepository.insert(user);

        return user;
    }

    // Delete user by ID
    @Override
    public void deleteById(UUID id) {

        boolean deleted = userRepository.deleteById(id);

        if (!deleted) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "User not found with ID: " + id
            );
        }
    }

}
