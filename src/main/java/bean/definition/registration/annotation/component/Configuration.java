package bean.definition.registration.annotation.component;

import bean.definition.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Configuration {
    @Bean
    public User user() {
        User user = new User();
        user.setName("Tony");
        user.setAge(20);
        return user;
    }
}
