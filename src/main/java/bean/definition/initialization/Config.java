package bean.definition.initialization;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(initMethod = "initCat")
    public Cat cat() {
        Cat cat = new Cat();
        cat.setColor("black");
        cat.setName("qq");
        return cat;
    }
}
