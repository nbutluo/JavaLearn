package Chapter03;

public class Java05_flowControl {

    public static void main(String[] args) {
        System.out.println("第一步");
        System.out.println("第二步");

        int age = 40;
        do {
            System.out.println("循环代码");
        } while (age > 40);

        for (int i = 0; i <= 5; i++) {
            System.out.println("循环的代码" + i);
        }


    }
}
