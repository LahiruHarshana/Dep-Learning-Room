package lk.ijse.dep12.jpa.realationship.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @author : L.H.J
 * @File: Actor
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-22, Monday
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "actor")
public class Actor {
    @Id
    private String id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Date dob;

    public static enum Gender{
        FEMALE,MALE
    }
}
