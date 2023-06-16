package 基础.二进制与十进制的转化;

public class Binary {
    public static void main(String[] args) {

        /**
         * 二进制转为十进制
         * 按权相加法
         * 从左边开始,小数点之前的数依次乘以2的权次方相加
         * 权 :  从小数点向左开始,依次为 0 ,1 ,2  ...  从小数点向右开始,依次为 -1,-2,-3, ...
         * Math : 与数学计算相关的类  Math.pow(a,b) 计算a的b次方
         */
        //二进制
        int a = 111;
        //转为十进制
        double pow = Math.pow(2, 0);
        double pow1 = Math.pow(2, 1);
        double pow2 = Math.pow(2, 2);
        int b = (int) (pow2 + pow1 + pow);
        System.out.println("111转为十进制为:" + b);


        /**
         * 十进制转为二进制
         * 除以二取余,逆向相加法
         *
         */
        int c = 173;
        int m = c / 2;
        int n = c % 2;
        String q = "";
        q = q + n;
        while (m != 0) {

            n = m % 2;
            m = m / 2;
            q = q + n;
        }
        char[] charArray = q.toCharArray();
        String s = "";
        for (int i = 0; i < charArray.length; i++) {
            s = charArray[i] + s;
        }
        System.out.println(s);


    }

}
