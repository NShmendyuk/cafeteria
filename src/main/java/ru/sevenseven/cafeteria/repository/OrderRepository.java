package ru.sevenseven.cafeteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sevenseven.cafeteria.model.Order;
import ru.sevenseven.cafeteria.model.Product;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Product> findAllProductsById(Long id);
    List<Order> findAllByClientId(Long id);
}
