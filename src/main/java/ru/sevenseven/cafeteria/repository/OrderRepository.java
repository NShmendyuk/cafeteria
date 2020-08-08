package ru.sevenseven.cafeteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sevenseven.cafeteria.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
