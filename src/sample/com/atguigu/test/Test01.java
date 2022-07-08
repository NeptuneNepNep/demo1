package sample.com.atguigu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample.com.atguigu.Stu;

public class Test01 {
    @Test
    public void test01() {
        //加载配置
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();

    }
}
