package lk.ijse.dep12.jpa.realationship.entity;

import jakarta.persistence.*;
import lombok.*;

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
    @Setter(AccessLevel.NONE)
    private List<Movie> movies = new ArrayList<>();
    public Actor(String id, String name, Gender gender, Date dob) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    public Actor(String id, String name, Gender gender, Date dob, List<Movie> movies) {
        if (movies != null  && !movies.isEmpty()){
            movies.stream().filter(movie -> movie.getActors().contains(this)).forEach(movie -> movie.getActors().add(this));
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.dob = dob;
            this.movies = movies;
        }

    }

    public static enum Gender{
        FEMALE,MALE
    }
}
