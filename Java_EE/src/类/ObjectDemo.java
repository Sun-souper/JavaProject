package 类;

import 基础.面向对象$$非常重要.封装.Person;

public class ObjectDemo {
    public static void main(StringDemo[] args) {
        /**
         * hashCode() 返回对象的哈希值(逻辑地址值)
         */
        Object o = new Object();
        int i = o.hashCode();
        System.out.println(i);

        /**
         *   getClass() 返回事物的对象
         */
        Class<Person> personClass = Person.class;
        Person person = new Person();
        Class<? extends Person> aClass = person.getClass();
        System.out.println(personClass);

        /**
         * toString() 以字符串的方式返回,可以对其进行操作
         *
         */
        String string = aClass.toString();
        System.out.println(string);

        /**
         * 重写对象中的equals方法可以将其进行比较,没重写时,比较的是地址值
         *
         */
        Person person1 = new Person();
        Person person2 = new Person();
        boolean equals = person1.equals(person2);
        System.out.println(equals);

    }
}
