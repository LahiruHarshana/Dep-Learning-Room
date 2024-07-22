package lk.ijse.dep12.jpa.realationship.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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
@ToString(exclude = "movies")
public class Actor {
    @Id
    private String id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Date dob;

    @ManyToMany(mappedBy = "actors",cascade = {CascadeType.PERSIST})
    private List<Movie> movies = new ArrayList<>();


    public Actor(String id, String name, Gender gender, Date dob) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    public static enum Gender{
        FEMALE,MALE
    }
}
