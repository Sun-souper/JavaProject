package 基础.静态static;

public class StaticDemo {
    //静态成员变量
    static String name;

    //静态代码块 创建对象时执行
    static {
        System.out.println("我是静态代码块");
    }

    //静态方法 (静态方法不能使用非静态方法和变量)
    public static void A(){
        System.out.println("我是静态方法1");
    }

}
