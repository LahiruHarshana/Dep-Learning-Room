package lk.ijse.dep12.jpa.relationship.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author : L.H.J
 * @File: User
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-16, Tuesday
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    private String nic;
    private String name;
    private String address;
    private Date dob;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @JoinColumn(name = "partner_nic",referencedColumnName = "nic")
    @OneToOne
    private User partnerNic;
    private Date date;

   public enum Gender {
        MALE,FEMALE
    }

    public User(String nic, String name, String address, Date dob, Gender gender) {
        this.nic = nic;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }
}
