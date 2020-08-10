package ru.sevenseven.cafeteria.service;

import ru.sevenseven.cafeteria.dto.ProductDto;
import ru.sevenseven.cafeteria.model.Product;

import java.util.List;

public interface IProductService {
    Product add(ProductDto productDto);
    List<Product> getAllProducts();

//    @Modifying
//    @Query("update Product u set u.available = ?1 where u.id = ?2")
    Product setAvailableById(Boolean available, Long id);
    Product setAvailableByName(Boolean available, String name);
}
