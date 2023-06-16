package 基础.面向对象$$非常重要.多态;

public class Demo {
    public static void main(String[] args) {
        /*
          1. 多态:同一个父类的方法,
               对于不同的子类,在重写方法时,
               实现的功能不同,表现形式不同
         */

        //父类的引用指向子类的对象 (向上转型,只能用重写的方法)
        Person person = new Person();
        Animal animal1 = new Dog();

        person.feed(animal1);
        Animal animal2 = new Cat();
        person.feed(animal2);

        //向下转型 可以调用子类特有的方法
        Cat cat = (Cat)animal2;

        /*
          1. instanceof : 判断 左对象是否是右类的实例
         */
        if(animal2 instanceof Cat){
            System.out.println("我是猫");
        }
    }
}
