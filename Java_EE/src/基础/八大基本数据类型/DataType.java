package 基础.八大基本数据类型;

public class DataType {
    public static void main(String[] args) {
        //整型
        /*
         * 1, byte :
         *       -128~127  占用1字节,8位
         * */
        byte bt = 23;

        /*
         * 2, short :
         *       -2^15~2^15-1  占用2字节,16位
         * */
        short sh = 129;

        /*
         * 3, int    :
         *       -2^31~2^31-1  占用4个字节,32位
         * */
        int i = 10000;

        /*
         * 4, long   :
         *       -2^63~2^63-1  占用8个字节,64位
         * */
        long l = 1999999;

        //浮点型
        /*
         * 5, float  :
         *       -3.403*10^38~3.403*10^38  占用4个字节,32位
         * */
        float f = 0.24F;

        /*
         * 6, double :
         *       范围最大    占用8个字节,64位
         * */
        double d = 1.23d;

        //字符型
        /*
         * 6, char   :
         *       0~127   占用2字符,16位
         *       与其他基本类型进行计算时按照ASCII码表进行转换为int类型纪计算
         *       与String类型计算时,为字符串的拼接
         * */
        char ca = 'a';

        //布尔型
        /*
         * 7, booolean   :
         *           默认false  占用4字符,32位
         * */
        boolean bo = true;

        /*
         * 大小比较  :
         *       byte < short < int < long < float < double
         * */
    }
}
