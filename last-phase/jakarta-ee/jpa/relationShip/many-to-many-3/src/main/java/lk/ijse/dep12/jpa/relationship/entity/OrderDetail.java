package lk.ijse.dep12.jpa.relationship.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_detail")
public class OrderDetail implements Serializable {
    @EmbeddedId
    private OrderDetailPK orderDetailPk;
    private int qty;
    private BigDecimal price;

    @ManyToOne
    @MapsId("orderId")
//    @JoinColumn(name = "order_id",referencedColumnName = "id",insertable = false,updatable = false)
    private Order order;

    @ManyToOne
    @MapsId("itemCode")
//    @JoinColumn(name = "item_code",referencedColumnName = "code" ,insertable = false,updatable = false)
    private Item item;

//    public OrderDetail(OrderDetailPK orderDetailPk, int qty, BigDecimal price) {
//        this.orderDetailPk = orderDetailPk;
//        this.qty = qty;
//        this.price = price;
//    }
//    public OrderDetail(String orderId,String itemCode, int qty, BigDecimal price) {
//        this.orderDetailPk = new OrderDetailPK(orderId,itemCode);
//        this.qty = qty;
//        this.price = price;
//    }
    public OrderDetail(Order order,Item item, int qty, BigDecimal price) {
        this.orderDetailPk = new OrderDetailPK(order.getId(),item.getCode());
        this.qty = qty;
        this.price = price;
    }

}