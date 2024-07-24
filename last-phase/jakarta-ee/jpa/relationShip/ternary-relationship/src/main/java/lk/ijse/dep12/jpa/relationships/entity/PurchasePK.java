package lk.ijse.dep12.jpa.relationships.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.A;

import java.io.Serializable;

/**
 * @author : L.H.J
 * @File: PurchasePK
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-24, Wednesday
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchasePK implements Serializable {
    private Customer customer;
    private Product product;
    private Supplier supplier;
}
