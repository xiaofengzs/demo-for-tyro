package bean.definition.name;

import bean.definition.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanNameDemoForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(Config.class);
        applicationContext.refresh();
        System.out.println(applicationContext.getBeansOfType(User.class));
    }
}
