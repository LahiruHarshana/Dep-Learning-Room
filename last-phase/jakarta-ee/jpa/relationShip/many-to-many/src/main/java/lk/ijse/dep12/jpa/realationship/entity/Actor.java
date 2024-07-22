package lk.ijse.dep12.jpa.realationship.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private Gender gender;
    private Date dob;

    public static enum Gender{
        FEMALE,MALE
    }
}
