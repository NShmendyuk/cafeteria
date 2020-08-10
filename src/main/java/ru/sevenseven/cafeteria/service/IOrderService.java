package ru.sevenseven.cafeteria.service;

import ru.sevenseven.cafeteria.dto.OrderDto;
import ru.sevenseven.cafeteria.model.Order;
import ru.sevenseven.cafeteria.model.Product;
import ru.sevenseven.cafeteria.model.User;

import java.util.List;

public interface IOrderService {
    Order add(User user, OrderDto orderDto);
    List<Product> getAllProductsByOrder(Long id);
    List<Order> getAllOrders();
}
