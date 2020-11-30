package bean.definition.alias;

import bean.definition.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAliasDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/bean-name-context.xml");
        System.out.println(applicationContext.getBeansOfType(User.class));
    }
}
