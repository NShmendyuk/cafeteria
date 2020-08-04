package ru.sevenseven.cafeteria.model;


import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "order")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long clientId;

    @Column
    private Timestamp time;

    // https://www.baeldung.com/hibernate-date-time какой-нибудь entity чтобы видеть
    // когда был принят заказ и/или к какому времени
    @Column
    private Timestamp timeOn;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.MERGE})
    @JoinTable(
            name = "order_product",
            joinColumns = @JoinColumn(name = "orderId", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "productId", referencedColumnName = "id"))
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
        return Objects.hash(id, clientId, time, timeOn, products);
    }

}
