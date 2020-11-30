package bean.definition.registration.annotation.atimport;

import bean.definition.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Import(Config.class)
@Component
public class BeanCreationDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("bean.definition.registration.annotation.atimport");
        User bean = applicationContext.getBean(User.class);
        System.out.println(bean);
    }
}
