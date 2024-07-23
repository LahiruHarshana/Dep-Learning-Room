package lk.ijse.dep12.jpa.relationship.entity;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : L.H.J
 * @File: OrderDetailPK
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-23, Tuesday
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailPK implements Serializable {
    private Order order;
    private Item item;
}
