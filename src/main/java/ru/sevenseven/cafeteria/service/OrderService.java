package ru.sevenseven.cafeteria.service;

import ru.sevenseven.cafeteria.model.Order;
import ru.sevenseven.cafeteria.model.Product;
import ru.sevenseven.cafeteria.repository.OrderRepository;

import java.util.List;

public class OrderService implements IOrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @Override
    public void add(Order order){
        orderRepository.save(order);
    }

    @Override
    public Order addProduct(Order order, Product product){
        orderRepository.addProductToOrder(order, product);
    }

    @Override
    public Order addProductsArray(Order order, Product[] products){
        return orderRepository.addProductsToOrder(order, products);
    }

    @Override
    public List<Product> getAllProductsByOrder(Order order){
        return order.getProducts();
    }

    @Override
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
}
