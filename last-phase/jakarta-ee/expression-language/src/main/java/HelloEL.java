import jakarta.el.ExpressionFactory;
import jakarta.el.StandardELContext;
import jakarta.el.ValueExpression;

/**
 * @author : L.H.J
 * @File: HelloEL
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/
public class HelloEL {
    public static void main(String[] args) {
        ExpressionFactory ef =ExpressionFactory.newInstance();
        StandardELContext standardELContext = new StandardELContext(ef);
        ValueExpression valueExpression = ef.createValueExpression(standardELContext, "#{'hello'+='el'}", String.class);
        Object value = valueExpression.getValue(standardELContext);
        System.out.println(value);
    }
}
