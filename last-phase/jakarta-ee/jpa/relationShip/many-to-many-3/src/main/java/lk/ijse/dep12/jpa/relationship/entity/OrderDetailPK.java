package lk.ijse.dep12.jpa.relationship.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : L.H.J
 * @File: OrderDetailPK
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-23, Tuesday
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class OrderDetailPK {
    @Column(name = "order_id")
    private String orderId;
    @Column(name = "item_code")
    private String itemCode;
}
