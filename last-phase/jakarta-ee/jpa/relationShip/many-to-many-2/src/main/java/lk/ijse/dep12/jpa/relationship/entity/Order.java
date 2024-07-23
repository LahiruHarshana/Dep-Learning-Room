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

    public Order(String id, Date date, String customerName) {
        this.id = id;
        this.date = date;
        this.customerName = customerName;
    }
    public Order(String id, Date date, String customerName, List<OrderDetail> orderDetailList) {
        if (orderDetailList != null && !orderDetailList.isEmpty()){
            orderDetailList.stream().filter(od -> od.getOrder() == null).forEach(od -> od.setOrder(this));
            orderDetailList.forEach( od -> {
                if (od.getOrder() != this) throw new IllegalStateException("The order %s is already associate with another order".formatted(od.getOrder().getId()));
            });
        }
        this.id = id;
        this.date = date;
        this.customerName = customerName;
        this.orderDetailList = orderDetailList;
    }

    @PrePersist
    public void beforePersist(){
        if(getOrderDetailList().isEmpty())
            throw new IllegalStateException("The order does not have any order details");
    }
}
