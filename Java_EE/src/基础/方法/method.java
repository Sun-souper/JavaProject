package 基础.方法;

public class method {
    public static void main(String[] args) {
        /*
          方法: 把共同完成一种任务的代码放到一个地方,以便使用,可以多次使用
         */
        A();
        int b = B();
        System.out.println(b);
        C(3);
        int d = D(4);
        System.out.println(d);

    }

    //无参有无回值 public void 方法名(){}
    public static void  A(){
        System.out.println("方法1");
    }

    //无参有返回值 public 返回值类型 方法名(){}
    public static int B(){
        return 5;
    }

    //有参无返回值 public void 方法名( 数据类型 变量名 ){}
    public static void C(int i){
        System.out.println(i+"方法3");
    }

    //有参又返回值
    public static int D(int i){
        return i;
    }

}
