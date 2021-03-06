package ru.vadimsaulin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vadimsaulin.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
