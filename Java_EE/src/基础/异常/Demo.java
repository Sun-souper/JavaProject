package 基础.异常;

public class Demo {
    public static void main(String[] args) {
        //异常捕捉
        /*
          执行流程: 如果try里面的代码没有异常，跳过catch 然后接着往下执行。
           如果trye里面有异常，就执行catch后面大括号的代码
         */
        int c = 0;
        int a = 2;
        try {
            c = a / c;
        }catch (Exception e){
            System.out.println("捕捉啦");
        }
    }
}
