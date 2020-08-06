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
    public Order add(Order order){
        return orderRepository.save(order);
    }

    @Override
    public List<Product> getAllProductsByOrder(Long id){
        return orderRepository.findAllProductsByOrder(id);
    }

    @Override
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
}
