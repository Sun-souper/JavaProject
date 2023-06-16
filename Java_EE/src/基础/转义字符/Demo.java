package 基础.转义字符;

public class Demo {
    public static void main(String[] args) {
        /*
          1. \n : 回车换行符 (字符串中)
          2. \t : 制表符    (字符串中)
          3. \  : 将一个无意义的字符转为有意义的字符,或者相反
         */

        //打印 "
        System.out.println("\"");

        //打印 \
        System.out.println("\\");

        //回车换行
        System.out.println("我的\n家乡");

        //制表符 , 不够八个补到八个,超过补到4的倍数
        System.out.println("01\t浩杰");
        System.out.println("02\t梦珂");
    }
}
