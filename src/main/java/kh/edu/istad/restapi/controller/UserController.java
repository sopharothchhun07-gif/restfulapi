
package kh.edu.istad.restapi.controller;

import kh.edu.istad.restapi.model.User;
import kh.edu.istad.restapi.service.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    // Constructor Injection
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // GET all users
    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    // GET user by ID
    @GetMapping("/{id}")
    public User getById(@PathVariable UUID id) {
        return userService.getById(id);
    }

    // POST new user
    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User user) {

        User newUser = userService.insert(user);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(newUser);
    }

    // DELETE user by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable UUID id) {

        userService.deleteById(id);

        return ResponseEntity.noContent().build();
    }

}
