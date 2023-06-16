package 基础.递归;

public class Recursion {
    /**
     * 利用方法内嵌套本身,在执行时会一直执行此方法,但数据在变化,满足条件时不在调用本身,依此来处理数据
     *
     * @param args
     */
    public static void main(String[] args) {
        char[] chars = {'1', '3', '5'};

        printReverse(chars);
    }

    private static void printReverse(char[] str) {
        helper(0, str);
    }


    private static void helper(int index, char[] str) {
        if (str == null || index >= str.length) {
            return;
        }
        helper(index + 1, str);
        System.out.print(str[index]);
    }
}
