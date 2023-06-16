package 基础.面向对象$$非常重要.重写与重载;

public class Person {
    //封装需要这类对象的共有属性,用private修饰,之后就不能被其他类自接使用
    private String name;
    private int age;

    //创建构造方法,用于创建这类对象


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //创建get,set方法便于使用对象的属性 set赋值 ,get获取
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //创建方法
    public void eat(){
        System.out.println("吃");
    }
}
