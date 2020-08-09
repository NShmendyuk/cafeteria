package ru.sevenseven.cafeteria.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Long price;

    @Column
    private Boolean available; // is product in stock? +/-

    public Product(){
        super();
        available = true;
    }

    @Override
    public String toString(){
        return name + " price: " + price.toString() + " available: " + available.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id.equals(product.id) && name.equals(product.name) && price.equals(product.price) && available.equals(product.available);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, available);
    }


}
