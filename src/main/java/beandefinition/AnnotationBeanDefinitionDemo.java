package beandefinition;

import bean.definition.model.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Map;

import static org.springframework.beans.factory.support.BeanDefinitionBuilder.genericBeanDefinition;

public class AnnotationBeanDefinitionDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        test1(annotationConfigApplicationContext);
        annotationConfigApplicationContext.refresh();
        Map<String, User> beansOfType = annotationConfigApplicationContext.getBeansOfType(User.class);
        System.out.println(beansOfType);
        annotationConfigApplicationContext.close();
    }

    public static void registerUserBeanDefinition(BeanDefinitionRegistry registry, String beanName) {
        BeanDefinitionBuilder beanDefinitionBuilder = genericBeanDefinition(User.class);
        beanDefinitionBuilder
                .addPropertyValue("name", "tom")
                .addPropertyValue("age", 18);
        registry.registerBeanDefinition(beanName, beanDefinitionBuilder.getBeanDefinition());
    }

    public static void test1(BeanDefinitionRegistry beanDefinitionRegistry){
        BeanDefinitionBuilder beanDefinitionBuilder = genericBeanDefinition(User.class);
        beanDefinitionBuilder
                .addPropertyValue("name", "tom")
                .addPropertyValue("age", 18);
        BeanDefinitionReaderUtils.registerWithGeneratedName(beanDefinitionBuilder.getBeanDefinition(), beanDefinitionRegistry);
    }

    public static class Config {
        @Bean({"zxf", "user"})
        public User user() {
            User user = new User();
            user.setName("zxf");
            user.setAge(18);
            return user;
        }
    }
}
