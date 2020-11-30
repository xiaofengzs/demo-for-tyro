package bean.definition.instantiation.constructor;

import bean.definition.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInstantiationDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/bean-instantiation-context.xml");
        applicationContext.refresh();
        System.out.println(applicationContext.getBeansOfType(User.class));
    }
}
