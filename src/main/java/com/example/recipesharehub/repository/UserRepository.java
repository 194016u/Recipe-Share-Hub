package com.example.recipesharehub.repository;

import com.example.recipesharehub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
