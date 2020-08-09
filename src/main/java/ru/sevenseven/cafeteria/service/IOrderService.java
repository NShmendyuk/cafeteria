package ru.sevenseven.cafeteria.service;

import ru.sevenseven.cafeteria.model.Order;
import ru.sevenseven.cafeteria.model.Product;

import java.util.List;

public interface IOrderService {
    Order add(Order order);
    List<Product> getAllProductsByOrder(Long id);
    List<Order> getAllOrders();
}
