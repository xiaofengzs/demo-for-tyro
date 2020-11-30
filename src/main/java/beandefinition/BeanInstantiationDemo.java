package beandefinition;

import bean.definition.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class BeanInstantiationDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:/bean-creation-context.xml");
        Map<String, User> beansOfType = classPathXmlApplicationContext.getBeansOfType(User.class);
        System.out.println(beansOfType);
    }
}
