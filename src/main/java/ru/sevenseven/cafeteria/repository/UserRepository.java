package ru.sevenseven.cafeteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sevenseven.cafeteria.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin(String login);
}
