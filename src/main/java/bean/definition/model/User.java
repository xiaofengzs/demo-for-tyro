package bean.definition.model;

public class User {
    private String name;
    private Integer age;

    private String cardid;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static User createUser() {
        User user = new User();
        user.setAge(10);
        user.setName("TT");
        return user;
    }

    public void init() {
        cardid = "00001";
    }
}
