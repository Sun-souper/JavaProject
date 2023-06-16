package 基础.运算符;

public class Arithmetic {
    public static void main(String[] args) {
        /**
         * 1. +  加
         * 2. -  减
         * 3. *  乘
         * 4. /  除
         * 5. %  取余
         */

        // +
        System.out.println(1+2);

        // -
        System.out.println(3-2);

        // *
        System.out.println(2*3);

        // /
        System.out.println(3/2);

        // %
        System.out.println(3%2);

        /**
         *  符号左右两边先按照第一个计算,然后结果赋值给左边
         * 1. += 加等
         * 2. -= 减等
         * 3. *= 乘等
         * 4. /= 除等
         */

        int a = 10;

        // +=
        a+=3;
        System.out.println(a);

        // *=
        a = 10;
        a*=3;
        System.out.println(a);

        // -=
        a = 10;
        a-=3;
        System.out.println(a);

        // /=
        a = 10;
        a/=2;
        System.out.println(a);

        /*
          1. ++ 自增
          2. -- 自减
         */

        int i = 10;
        int b = 1;
        int c;

        // ++i 先自增后计算 (--i 同理)
        c = ++i + b;
        System.out.println(c);

        // i++ 先计算再自增 (i-- 同理)
        i = 10;
        c = i++ + b;
        System.out.println(c);
        c = i + b;
        System.out.println(c);

    }
}
