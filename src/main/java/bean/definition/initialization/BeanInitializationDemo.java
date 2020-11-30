package bean.definition.initialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInitializationDemo {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/bean-Initialization-context.xml");
//        System.out.println(applicationContext.getBean(Cat.class));

//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("bean.definition.initialization");
//        System.out.println(applicationContext.getBeansOfType(Cat.class));

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext();
        classPathXmlApplicationContext.refresh();
    }
}
