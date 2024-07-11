package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class Student implements Serializable {
    @Id
    private String id;
    private String name;
    @Column(name = "contact_number")
    private String contact;
}
