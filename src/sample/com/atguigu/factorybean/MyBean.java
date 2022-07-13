package sample.com.atguigu.factorybean;

import org.springframework.beans.factory.FactoryBean;
import sample.com.atguigu.Course;

public class MyBean implements FactoryBean {
    @Override
    public Course getObject() throws Exception {
        Course course= new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
