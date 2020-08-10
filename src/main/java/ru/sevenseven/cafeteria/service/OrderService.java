package ru.sevenseven.cafeteria.service;

import ru.sevenseven.cafeteria.dto.OrderDto;
import ru.sevenseven.cafeteria.model.Order;
import ru.sevenseven.cafeteria.model.Product;
import ru.sevenseven.cafeteria.model.User;
import ru.sevenseven.cafeteria.repository.OrderRepository;

import java.time.LocalDateTime;
import java.util.List;

public class OrderService implements IOrderService {
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @Override
    public Order add(User user, OrderDto orderDto){
        LocalDateTime timeOrdered = LocalDateTime.now();
        Order orderCreated = new Order();
        orderCreated.setTimeOn(orderDto.getTimeOn());
        orderCreated.setClient(user);
        orderCreated.setTime(timeOrdered);
        return orderRepository.save(orderCreated);
    }

    @Override
    public List<Product> getAllProductsByOrder(Long id){
        return orderRepository.findAllProductsById(id);
    }

    @Override
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
}
