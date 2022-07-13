package sample.com.atguigu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample.com.atguigu.Book;
import sample.com.atguigu.Course;
import sample.com.atguigu.Orders;
import sample.com.atguigu.Stu;
import sample.com.atguigu.autowrite.Emp;
import sample.com.atguigu.factorybean.MyBean;

public class Test01 {
    @Test
    public void test01() {
        //加载配置
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();

    }
    @Test
    public void test02() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book",Book.class);
        Book book2 = context.getBean("book",Book.class);
        System.out.println(book2);
        System.out.println(book);
    }
    @Test
    public void test03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("myBean",Course.class);
        System.out.println(course);


    }
    @Test
    public void test04(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders",Orders.class);
        System.out.println(orders);
        //手动销毁 使用实现类销毁
        ((ClassPathXmlApplicationContext)context).close();

    }
    @Test
    public void test05() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp",Emp.class);
        emp.test();
        Emp emp1 = context.getBean("emp1",Emp.class);
        emp1.test();
    }
}
