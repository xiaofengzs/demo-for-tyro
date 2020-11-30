package beandefinition;

import bean.definition.model.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAliasDemo {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/bean-context.xml");
        User zxfUser = beanFactory.getBean("zxf-user", User.class);
        User user = beanFactory.getBean("user", User.class);
        System.out.println(user == zxfUser);
    }
}
