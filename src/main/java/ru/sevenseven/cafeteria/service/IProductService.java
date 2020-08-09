package ru.sevenseven.cafeteria.service;

import ru.sevenseven.cafeteria.model.Product;

import java.util.List;

public interface IProductService {
    Product add(Product product);
    List<Product> getAllProducts();
}
