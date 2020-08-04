package ru.sevenseven.cafeteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sevenseven.cafeteria.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);
}
