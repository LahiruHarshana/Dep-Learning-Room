import jakarta.el.ExpressionFactory;
import jakarta.el.StandardELContext;
import jakarta.el.ValueExpression;

/**
 * @author : L.H.J
 * @File: LiteralAndOperators
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/
public class LiteralAndOperators {
    public static void main(String[] args) {
        ExpressionFactory ef = ExpressionFactory.newInstance();
        StandardELContext context = new StandardELContext(ef);
        ValueExpression ve1 = ef.createValueExpression(context,"${10}",int.class);
        int value1 = ve1.getValue(context);
        System.out.println(value1);

        ValueExpression ve2 = ef.createValueExpression(context,"${true}",boolean.class);
        boolean value2 = ve2.getValue(context);
        System.out.println(value2);

        ValueExpression ve3 = ef.createValueExpression(context,"${12.35}",float.class);
        float value3 = ve3.getValue(context);
        System.out.println(value3);


        ValueExpression ve4 = ef.createValueExpression(context,"${'hello el literals'}",String.class);
        String value4 = ve4.getValue(context);
        System.out.println(value4);
    }
}
