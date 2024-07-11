package lk.ijse.dep12.jpa.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : L.H.J
 * @File: Student
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-11, Thursday
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student implements Serializable {
    @Id
    private String id;
    private String name;
    @Column(name = "contact_number")
    private String contact;
}
