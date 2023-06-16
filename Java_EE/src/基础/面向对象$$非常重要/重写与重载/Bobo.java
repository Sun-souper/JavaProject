package 基础.面向对象$$非常重要.重写与重载;



public class Bobo extends Person {
    private String position;

    public Bobo() {
    }

    public Bobo(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void teach() {
        System.out.println(this.position + "教学生");
    }
    // 重载 : 在同一个类中方法名相同,参数不同 与返回值无关
    public int teach(int i){
        System.out.println("教Java");
        return i;
    }
    //重写,除了内容,其他与父类方法完全一致  @Override
    @Override
    public void eat(){
        System.out.println("吃大餐");
    }
}
