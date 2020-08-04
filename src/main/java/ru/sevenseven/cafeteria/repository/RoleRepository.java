package ru.sevenseven.cafeteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sevenseven.cafeteria.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
