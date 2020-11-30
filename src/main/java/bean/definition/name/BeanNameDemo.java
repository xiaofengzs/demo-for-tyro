package bean.definition.name;

import bean.definition.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanNameDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/bean-name-context.xml");
        System.out.println(applicationContext.getBeansOfType(User.class));
    }
}
