package ru.sevenseven.cafeteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sevenseven.cafeteria.model.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByClientId(Long id);
}
