package lk.ijse.dep12.jpa.relationship.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author : L.H.J
 * @File: Customer
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-17, Wednesday
 **/

@Data
@ToString(exclude = "orders")
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer implements Serializable {
    @Id
    private String contact;
    private String name;
    private String address;
    @OneToMany(mappedBy = "customer")
    private List<Order> orders = new ArrayList<>();//persistence bag


    public Customer(String contact, String name, String address, List<Order> orders) {
        if (orders != null && !orders.isEmpty()){
            orders.stream().filter(order -> order.getCustomer() == null).forEach((order -> order.setCustomer(this)));
        }

        if (orders != null && ! orders.isEmpty()){
            orders.forEach(order -> {
                if (order.getCustomer() != this)
                    throw new IllegalStateException("An order :%s is already associated with another customer".formatted(order.getId()));
            });
        }
        this.contact = contact;
        this.name = name;
        this.address = address;
        this.orders = orders;
    }

    public Customer(String contact, String name, String address) {
        this.contact = contact;
        this.name = name;
        this.address = address;
    }
}
