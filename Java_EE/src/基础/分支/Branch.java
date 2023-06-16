package 基础.分支;

public class Branch {
    public static void main(String[] args) {
        /*
          1. if分支  if(){}
          2. if-else分支  if(){}else{}
          3. switch-case
         */

        //if分支 ,()内为true才执行{}内的语句
        int score = 50;
        if (score > 80) {
            System.out.println("奖励一个宝剑");
        }
        if (score <80) {
            System.out.println("奖励一个布甲");
        }

        //if-else if后()内不为true,执行else后的{}内的
        if (false) {
            System.out.println("呵呵");
        } else {
            System.out.println("嘿嘿");
        }

        //switch-case  ()内结果为case后的,执行其下面的语句,都不是执行default下面的语句
        // 其()内不能为布尔类型和浮点类型(浮点类型精度低)
        switch (3-2){
            case 1:
                System.out.println("执行1");
                break;
            case 2:
                System.out.println("执行2");
                break;
            default:
                System.out.println("执行3");
        }
    }
}
