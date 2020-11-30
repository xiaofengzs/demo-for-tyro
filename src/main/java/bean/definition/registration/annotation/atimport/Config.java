package bean.definition.registration.annotation.atimport;

import bean.definition.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class Config {
    @Bean
    public User user() {
        User user = new User();
        user.setName("zxf");
        user.setAge(20);
        return user;
    }
}
