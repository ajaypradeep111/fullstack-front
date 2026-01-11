package com.example.fullstack_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fullstack_backend.models.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
