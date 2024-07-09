import jakarta.el.ExpressionFactory;
import jakarta.el.StandardELContext;
import jakarta.el.ValueExpression;

public class ELOperators3 {
    public static void main(String[] args) {
        ExpressionFactory ef = ExpressionFactory.newInstance();
        StandardELContext context = new StandardELContext(ef);
        Student s1 = new Student(1,"Kasun",95);
        Student s2 = new Student(1,"Nuwan",66);
        Student s3 = new Student(1,"Ruwan",55);
        Student s4 = new Student(1,"Saman",88);
        context.getVariableMapper().setVariable("s1",ef.createValueExpression(s1,Student.class));
        context.getVariableMapper().setVariable("s2",ef.createValueExpression(s2,Student.class));
        context.getVariableMapper().setVariable("s3",ef.createValueExpression(s3,Student.class));
    }

    static class Student{
        int id;
        String name;
        int marks;

        public Student(int id,String name , int marks){
            this.id = id;
            this.name = name;
            this.marks = marks;
        }
    }


}

