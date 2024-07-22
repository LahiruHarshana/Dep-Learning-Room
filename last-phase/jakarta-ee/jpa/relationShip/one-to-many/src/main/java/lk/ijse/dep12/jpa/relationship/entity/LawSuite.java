package lk.ijse.dep12.jpa.relationship.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

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
public class LawSuite implements Serializable {
    @Id
    private String id ;
    private String type;
    private String description;
    @Column(name = "filed_date")
    private Date filedDate;
    @ManyToOne
    @JoinColumn(name = "lawyer_reg_number",referencedColumnName = "reg_number")
    private Lawyer lawyer;
    @Column(name = "lawyer_retainer_date")
    private String lawyerRetainerDate;
    @Column(name = "lawyer_fee")
    private BigDecimal lawyerFee;
}
