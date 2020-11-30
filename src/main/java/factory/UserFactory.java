package factory;

import bean.definition.model.User;

public interface UserFactory {
    default User createUser() {
        return new User();
    }
}
