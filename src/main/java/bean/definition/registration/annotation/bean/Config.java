package bean.definition.registration.annotation.bean;

import bean.definition.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Config {
    @Bean(name = {"user", "zxf"})
    public User user() {
        User user = new User();
        user.setName("zxf");
        user.setAge(18);
        return user;
    }
}
