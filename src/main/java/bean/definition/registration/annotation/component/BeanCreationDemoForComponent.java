package bean.definition.registration.annotation.component;

import bean.definition.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class BeanCreationDemoForComponent {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("bean.definition.registration.annotation.component");
        Map<String, User> beans = applicationContext.getBeansOfType(User.class);
        System.out.println(beans);
    }
}
