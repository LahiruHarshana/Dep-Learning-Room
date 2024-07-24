package lk.ijse.dep12.jpa.relationships.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.checkerframework.checker.units.qual.N;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author : L.H.J
 * @File: Purchase
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-24, Wednesday
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "purchase")
@IdClass(PurchasePK.class)
public class Purchase implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Id
    @ManyToOne
    @JoinColumn(name = "product_code")
    private Product product;
    @Id
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
    private int discount;
    private BigDecimal price;
}
