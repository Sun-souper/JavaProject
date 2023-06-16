package 基础.面向对象$$非常重要.封装;

public class Package {
    public static void main(String[] args) {
        /*
          1. 封装是把一种事物共有的特征,放在一个类中,方便调用

         */

        //利用封装好的构造方法创建对象
        Person person = new Person();
        //给属性赋值
        person.setAge(26);
        person.setName("哈哈");

        //取值
        System.out.println(person.getName());
        System.out.println(person.getAge());

        //调用方法
        person.eat();
    }
}
