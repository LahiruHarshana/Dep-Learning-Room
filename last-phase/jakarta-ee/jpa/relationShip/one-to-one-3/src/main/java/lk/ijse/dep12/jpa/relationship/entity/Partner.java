package lk.ijse.dep12.jpa.relationship.entity;

import jakarta.persistence.*;
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
    @JoinColumn(name = "user1_nic",referencedColumnName = "nic")
    private String user1Nic;
    @OneToOne
    @JoinColumn(name = "user2_nic",referencedColumnName = "nic")
    private User user2Nic;
    private Date date;
}
