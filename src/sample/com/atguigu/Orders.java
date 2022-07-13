package sample.com.atguigu;

public class Orders {
    String oName;
    public Orders() {
        System.out.println("无参构造调用");

    }
    public String getoName() {

        return oName;
    }

    public void setoName(String oName) {
        System.out.println("调用set");
        this.oName = oName;
    }
    public void initMethod() {
        System.out.println("执行初始化");

    }
    public void destoryMethod() {
        System.out.println("销毁");

    }
}
