package lk.ijse.dep12.jpa.relationship.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : L.H.J
 * @File: Order
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-23, Tuesday
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "`order`")
@ToString(exclude = "orderDetailList")
public class Order {
    @Id
    private String id;
    private Date date;
    @Column(name = "customer_name")
    private String customerName;
    @OneToMany(mappedBy = "order", cascade = {CascadeType.PERSIST,CascadeType.DETACH})
    @Setter(AccessLevel.NONE)
    private List<OrderDetail> orderDetailList = new ArrayList<>();
}
