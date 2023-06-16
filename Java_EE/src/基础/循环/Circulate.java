package 基础.循环;

public class Circulate {
    public static void main(String[] args) {
        /*
          1. for循环
          2. wheil循环
          3. break
          4. continue
         */

        //for循环 + break(结束循环)
        for (int i = 0; i < 4; i++) {
            if(i==2){
                break;
            }
            System.out.println(i);
        }

        //while循环 + continue(跳过本次循环)
        int i = 1;
        while (i<5){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }

    }
}
