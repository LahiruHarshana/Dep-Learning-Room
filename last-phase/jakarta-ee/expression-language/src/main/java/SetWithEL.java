import jakarta.el.ExpressionFactory;
import jakarta.el.StandardELContext;
import jakarta.el.ValueExpression;

import java.util.List;
import java.util.Set;

/**
 * @author : L.H.J
 * @File: SetWithEL
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/
public class SetWithEL {
    public static void main(String[] args) {
        ExpressionFactory ef = ExpressionFactory.newInstance();
        StandardELContext context = new StandardELContext(ef);
        ValueExpression ve = ef.createValueExpression(context,"${{10,20,30,40}}", Set.class);
        Set<Long> set = ve.getValue(context);
        set.forEach(System.out::println);
    }
}
