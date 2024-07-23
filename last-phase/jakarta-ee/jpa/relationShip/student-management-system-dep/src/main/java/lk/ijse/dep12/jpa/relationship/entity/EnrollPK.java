package lk.ijse.dep12.jpa.relationship.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : L.H.J
 * @File: EnrollPK
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-23, Tuesday
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnrollPK implements Serializable {
    private Student student;
    private Course course;
}
