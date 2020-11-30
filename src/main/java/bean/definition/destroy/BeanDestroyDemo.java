package bean.definition.destroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDestroyDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("bean.definition.destroy");
        System.out.println(applicationContext.getBeansOfType(Dog.class));
    }
}
