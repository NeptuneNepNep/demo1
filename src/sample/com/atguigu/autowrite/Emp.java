package sample.com.atguigu.autowrite;

public class Emp {
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "dept="+dept;
    }
    public void test() {
        System.out.println(toString());

    }
}
