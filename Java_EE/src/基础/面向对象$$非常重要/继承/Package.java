package 基础.面向对象$$非常重要.继承;

import 基础.面向对象$$非常重要.重写与重载.Bobo;

public class Package {
    public static void main(String[] args) {
        /*
          1. 继承是通过extends把子类和父类连接起来
          2. 子类可以调用父类非私有的方法
          3. 创建对象时先执行父类构造方法,在执行子类构造方法
          4. 父类中没有无参,子类也不能有
         */

        //利用封装好的构造方法创建对象
        Bobo bobo = new Bobo();
        //赋值
        bobo.setName("博博");
        bobo.setAge(18);
        bobo.setPosition("教师");
        //调用父类非私有方法
        bobo.eat();
        //调用独有方法
        bobo.teach();
    }
}
