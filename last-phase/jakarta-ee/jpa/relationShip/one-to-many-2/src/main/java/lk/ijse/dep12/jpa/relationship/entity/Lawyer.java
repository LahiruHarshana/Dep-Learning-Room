package lk.ijse.dep12.jpa.relationship.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : L.H.J
 * @File: Lawyer
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-22, Monday
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lawyer")
public class Lawyer {
    @Id
    @Column(name = "reg_number")
    private String regNumber;
    private String name;
}
