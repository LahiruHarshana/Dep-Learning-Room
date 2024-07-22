package lk.ijse.dep12.jpa.relationship.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author : L.H.J
 * @File: LawSuite
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-22, Monday
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "law_suite")
public class LawSuite {
    @Id
    private String id;
    private String type;
    private String description;
    @Column(name = "filed_date")
    private Date filedDate;
    @ManyToOne
    private Lawyer lawyer;
}
