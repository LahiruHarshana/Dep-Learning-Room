package lk.ijse.dep12.jpa.relationship.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @author : L.H.J
 * @File: User
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-17, Wednesday
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    private String nic;
    private String name;
    private String address;
    private Date dob;
    @Enumerated(EnumType.STRING)
    private  Gender gender;
    public static enum Gender{
        MALE,FEMALE
    }
}
