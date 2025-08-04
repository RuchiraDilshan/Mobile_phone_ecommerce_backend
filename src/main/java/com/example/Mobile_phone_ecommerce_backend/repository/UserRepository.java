package com.example.Mobile_phone_ecommerce_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Ensure the import below matches the actual package of your User class
// For example, if User is in 'entity' package, use:
// Update the import below to match the actual package of your User class
// For example, if User is in 'model' package, use:
import com.example.Mobile_phone_ecommerce_backend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
