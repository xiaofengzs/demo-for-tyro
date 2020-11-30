package bean.definition.name;

import bean.definition.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Config {
    @Bean
    public User user() {
        User user = new User();
        user.setAge(18);
        user.setName("zxf");
        return user;
    }
}
