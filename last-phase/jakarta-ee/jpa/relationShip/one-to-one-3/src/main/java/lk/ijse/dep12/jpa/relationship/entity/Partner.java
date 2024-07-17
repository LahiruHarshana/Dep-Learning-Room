package lk.ijse.dep12.jpa.relationship.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @author : L.H.J
 * @File: Partner
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-17, Wednesday
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "partner")
public class Partner {
    @Id
    @Column(name = "user1_nic")
    String user1Nic;
    @Column(name = "user2_nic")
    String user2Nic;
    Date date;
}
