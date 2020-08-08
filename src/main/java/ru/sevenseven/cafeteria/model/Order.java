package ru.sevenseven.cafeteria.model;


import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long clientId;

    @Column
    private Timestamp time;

    @Column
    private Timestamp timeOn;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "order_products",
            joinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"))
    private Collection<Product> products;


    @Override
    public String toString(){
        return "(order id: " + id.toString()
                + "; clientId: " + clientId.toString()
                + ") ordered at: " + time.toString()
                + "; on: " + timeOn
                + "\n"
                + products.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id.equals(order.id) &&
                clientId.equals(order.clientId) &&
                time.equals(order.time) &&
                timeOn.equals(order.timeOn) &&
                products.equals(order.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientId,
                time, timeOn,
                products);
    }

}
