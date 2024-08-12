package lk.ijse.dep12.jpa.quries.entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : L.H.J
 * @File: OrderDetailPK
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-08-08, Thursday
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailPK implements Serializable {
    private Order order;
    private Item item;
}
