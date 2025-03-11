package Chapter04;

public class Java01bak {
    public static void main(String[] args) {

        Pic p = new Pic();

        p.name = "达芬奇的向日葵";
        p.color = "红色";
        p.draw();

    }


}

class Pic {
    String name;
    String color;

    void draw() {
        System.out.println("今天的画作是" + name);
        System.out.println("主调颜色是" + color);
    }
}


