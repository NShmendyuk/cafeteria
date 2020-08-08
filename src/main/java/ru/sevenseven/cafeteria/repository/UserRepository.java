package ru.sevenseven.cafeteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sevenseven.cafeteria.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();
    User findByLogin(String login);
}