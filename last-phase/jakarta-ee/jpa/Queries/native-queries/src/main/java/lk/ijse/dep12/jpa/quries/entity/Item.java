package lk.ijse.dep12.jpa.quries.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author : L.H.J
 * @File: Item
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-08-08, Thursday
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "item")
public class Item {
    @Id
    @Column(name = "bar_code")
    private String bar_code;
    private String description;
    private int stock;
    private BigDecimal price;
}
