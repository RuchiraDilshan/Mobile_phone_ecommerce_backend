package com.example.Mobile_phone_ecommerce_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.Mobile_phone_ecommerce_backend.repository.UserRepository;
import com.example.Mobile_phone_ecommerce_backend.model.User;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    // to register an user

    public User registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    // find by the user email address

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

}
