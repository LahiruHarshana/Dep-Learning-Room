package lk.ijse.dep12.jpa.relationship.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

/**
 * @author : L.H.J
 * @File: Account
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-16, Tuesday
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account {
    @Id
    String number;
    String type;
    BigDecimal balance;
    @Column(name = "customer_nic")
    String customerNic;
    @Column(name = "open_date")
    private Date openDate;
    String username;
}
