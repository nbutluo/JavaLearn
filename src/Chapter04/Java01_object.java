package Chapter04;

public class Java01_object {
    public static void main(String[] args) {

        Cooking c = new Cooking();

        c.name = "做饭流程";
        c.execute();

        Cooking c1 = new Cooking();

        c1.name = "下面条";
        c1.type = "清汤";
        c1.food = "牛肉面";
        c1.execute();
    }


}

class Cooking {
    String name;
    String type = "红烧";
    String food = "";


    void execute() {
        System.out.println("开始烹饪" + name);
        System.out.println("准备食材" + type);
        System.out.println("今天吃" + food);
        System.out.println("烹饪完成");
    }

}