package bean.definition.destroy;

import org.springframework.beans.factory.DisposableBean;

import javax.annotation.PreDestroy;

public class Dog implements DisposableBean {
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
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("@PreDestroy :  销毁中...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean#destroy() : 销毁中...");
    }

    public void doDestroy() {
        System.out.println("自定义销毁方法 doDestroy() : 销毁中...");
    }
}
