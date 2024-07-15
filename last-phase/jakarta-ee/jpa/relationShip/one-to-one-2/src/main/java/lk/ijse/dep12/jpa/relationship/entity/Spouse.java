package lk.ijse.dep12.jpa.relationship.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : L.H.J
 * @File: Spouse
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-15, Monday
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "spouse")
public class Spouse implements Serializable {
    @Id
    private String id;
    private String name;
    private String contact;
    @OneToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    private Employee employee;
}
