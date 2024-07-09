package lk.ijse.dep12;

import jakarta.el.ExpressionFactory;
import jakarta.el.StandardELContext;

public class InstanceMembers {
    public static void main(String[] args) {
        ExpressionFactory ef = ExpressionFactory.newInstance();
        StandardELContext context = new StandardELContext(ef);

    }
}

