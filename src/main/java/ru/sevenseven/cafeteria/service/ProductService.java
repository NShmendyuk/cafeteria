package ru.sevenseven.cafeteria.service;

import ru.sevenseven.cafeteria.dto.ProductDto;
import ru.sevenseven.cafeteria.model.Product;
import ru.sevenseven.cafeteria.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public Product add(ProductDto productDto){
        Product productCreated = new Product();
        productCreated.setName(productDto.getName());
        productCreated.setPrice(productDto.getPrice());
        return productRepository.save(productCreated);
    }

    @Override
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @Override
    public Product setAvailableById(Boolean available, Long id){
        return productRepository.save(productRepository.findById(id).setAvailable(available));
    }

    @Override
    public Product setAvailableByName(Boolean available, String name){
        return productRepository.save(productRepository.findByName(name).setAvailable(available));
    }
}
