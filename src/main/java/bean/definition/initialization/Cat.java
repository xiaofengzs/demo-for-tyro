package bean.definition.initialization;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class Cat implements InitializingBean {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct init ...");
    }

    public void initCat() {
        System.out.println("init cat ...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet ... ");
    }
}
