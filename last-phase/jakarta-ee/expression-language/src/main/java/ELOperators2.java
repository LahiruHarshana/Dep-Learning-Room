import jakarta.el.ExpressionFactory;
import jakarta.el.StandardELContext;
import jakarta.el.ValueExpression;

public class ELOperators2 {
    public static void main(String[] args) {
        ExpressionFactory ef = ExpressionFactory.newInstance();
        StandardELContext context = new StandardELContext(ef);
        int x =10 , y=20;
        context.getVariableMapper().setVariable("x", ef.createValueExpression(x,int.class));
        context.getVariableMapper().setVariable("y", ef.createValueExpression(x,int.class));
        ValueExpression ve1 = ef.createValueExpression(context,
                "${not(x gt y) and (x > 5 or y > 2) ? 'ijse':'dep'}",String.class);
        String value1 = ve1.getValue(context);
        System.out.println(value1);
    }
}