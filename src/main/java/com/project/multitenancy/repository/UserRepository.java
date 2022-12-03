package com.project.multitenancy.repository;

import com.project.multitenancy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
