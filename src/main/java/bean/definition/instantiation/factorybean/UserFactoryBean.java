package bean.definition.instantiation.factorybean;

import bean.definition.model.User;
import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        User user = new User();
        user.setAge(26);
        user.setName("Phoebe");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
