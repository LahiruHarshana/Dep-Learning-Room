package lk.ijse.dep12.jpa.relationship.entity;

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
 * @File: Spouse
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-15, Monday
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_id")
public class Spouse implements Serializable {
    @Id
    private String id;
    private  String name;
    private String contact;
    @Column(name = "employee_id")
    private String employeeId;
}
