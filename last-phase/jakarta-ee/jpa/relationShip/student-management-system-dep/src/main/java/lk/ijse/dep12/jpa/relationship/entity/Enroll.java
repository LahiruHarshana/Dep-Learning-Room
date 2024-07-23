package lk.ijse.dep12.jpa.relationship.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @author : L.H.J
 * @File: Enroll
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-23, Tuesday
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "enroll")
public class Enroll {
    @Id
    @ManyToOne
    @JoinColumn(name = "student_id" , referencedColumnName = "id")
    private Student student;

    @Id
    @ManyToOne
    @JoinColumn(name = "course_code" , referencedColumnName = "code")
    private Course course;


    @Column(name = "registered_by")
    private String registeredBy;
    private Date date;



}
