package bean.definition.instantiation.factory;

import bean.definition.model.User;

public interface UserFactory {
    default User buildUser() {
        User user = new User();
        user.setName("James");
        user.setAge(15);
        return user;
    }
}
