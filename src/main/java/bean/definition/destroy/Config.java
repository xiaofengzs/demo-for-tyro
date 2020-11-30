package bean.definition.destroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(destroyMethod = "doDestroy")
    public Dog dog() {
        Dog dog = new Dog();
        dog.setName("black");
        dog.setColor("black");
        return dog;
    }
}
