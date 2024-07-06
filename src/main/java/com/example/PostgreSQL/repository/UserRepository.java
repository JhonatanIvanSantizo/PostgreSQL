package com.example.PostgreSQL.repository;

import com.example.PostgreSQL.postgres.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
