package com.example.server.controller;

import com.example.server.entity.User;
import com.example.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    // standard constructors

    @Autowired
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        user = userRepository.save(user); // Assign the persisted object back to user
        System.out.println("Saved ID: " + user.getId());
    }
    @RequestMapping("/delete/{id}")
    void deleteUser(@PathVariable Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            System.out.println("Deleted user with ID: " + id);
        } else {
            System.out.println("User with ID " + id + " not found.");
        }
    }



}
