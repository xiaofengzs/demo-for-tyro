package beandefinition;

import bean.definition.model.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(User.class)
public class Config3 {

}
