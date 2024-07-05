import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author : L.H.J
 * @File: Order
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-05, Friday
 **/


@Data
@AllArgsConstructor
public record Order (Integer id ,
                     String customerName ,
                     BigDecimal total,
                     @JsonFormat(pattern = "yyyy-MM-dd")
                     LocalDate date){
}
