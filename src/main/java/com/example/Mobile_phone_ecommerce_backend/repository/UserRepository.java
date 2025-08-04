package com.example.Mobile_phone_ecommerce_backend.repository;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public class UserRepository extends JpaRepository<user, Integer> {
    User findByEmail(String email);

}
