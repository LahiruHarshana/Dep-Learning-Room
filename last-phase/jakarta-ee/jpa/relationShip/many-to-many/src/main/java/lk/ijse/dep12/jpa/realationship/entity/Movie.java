package lk.ijse.dep12.jpa.realationship.entity;

import jakarta.persistence.Column;

import java.sql.Date;

/**
 * @author : L.H.J
 * @File: Movie
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-22, Monday
 **/
public class Movie {
    private String id;
    private String name;
    private String genre;
    @Column(name = "release_year")
    private Date releaseYear;
}
