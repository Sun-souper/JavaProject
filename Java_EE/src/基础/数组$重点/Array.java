package 基础.数组$重点;

public class Array {
    public static void main(String[] args) {
        /*
          1. 数组是一个用来存储大量同类型数据的容器
          2. 二维数组是数组的嵌套
         */

        // 声明方式
        //      第一种  数据类型[]  数组名 = {数据1,数据2,...}
        int[] arrInt = {1,2,3};

        //      第二种  数据类型[]  数组名 = new 数据类型[数组长度]
        char[] arrChar = new char[4];
        // 存入  数组名[索引] = 值;   (索引:第几位,从0(第一位)位开始)
        arrChar[0] = 'a';
        //不给值为默认 整数默认为0 , 布尔默认0.0 , String默认null , char默认null

        // 取值 数组名[索引]
        System.out.println(arrChar[0]);
        // 循环取值
        for (int j : arrInt) {
            System.out.println(j);
        }

        //数组可以作为方法的返回值,也可以作为方法的参数


    }
}
