package 基础.面向对象$$非常重要.继承;

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

    public void teach(){
        System.out.println(this.position+"教学生");
    }
}
