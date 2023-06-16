package 基础.静态static;

public class Demo {
    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
        //静态方法不能由对象调用,只能由类名直接调用
        StaticDemo.A();
    }
}
