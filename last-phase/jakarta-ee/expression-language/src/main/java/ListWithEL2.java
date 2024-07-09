import jakarta.el.ExpressionFactory;
import jakarta.el.StandardELContext;
import jakarta.el.ValueExpression;

/**
 * @author : L.H.J
 * @File: ListWithEL2
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/
public class ListWithEL2 {

    public static void main(String[] args) {
        ExpressionFactory ef = ExpressionFactory.newInstance();
        StandardELContext context = new StandardELContext(ef);
        ValueExpression ve = ef.createValueExpression(context,"${['dep','cmjd','gdse'].get(1).toUpperCase()}", String.class);
        String value = ve.getValue(context);
        System.out.println(value);
    }
}
