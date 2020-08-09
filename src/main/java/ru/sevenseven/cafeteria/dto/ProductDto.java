package ru.sevenseven.cafeteria.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductDto implements Serializable {
    private String name;
    private Long price;
}
