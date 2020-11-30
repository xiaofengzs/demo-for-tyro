package bean.definition.registration.annotation.bean;

import bean.definition.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanCreationDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(Config.class);
        applicationContext.refresh();
        User bean = applicationContext.getBean(User.class);
        System.out.println(bean);
    }
}
