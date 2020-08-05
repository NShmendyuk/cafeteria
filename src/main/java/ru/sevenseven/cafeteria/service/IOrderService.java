package ru.sevenseven.cafeteria.service;

import ru.sevenseven.cafeteria.dto.OrderDto;
import ru.sevenseven.cafeteria.model.Order;
import ru.sevenseven.cafeteria.model.Product;

import java.util.List;

public interface IOrderService {
    public void add(Order order);
    public Order addProduct(Order order, Product product);
    public Order addProductsArray(Order order, Product[] products);
    public List<Product> getAllProductsByOrder(Order order);
    public List<Order> getAllOrders();
}
