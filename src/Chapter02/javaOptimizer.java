package Chapter02;

public class javaOptimizer {
    public static void main(String[] args) {


        // 运算符：参与运算的符号

        System.out.println(1 + 1); //2
        System.out.println(3 - 1); //2
        System.out.println(3 * 2); // 6
        System.out.println(6 / 2);  // 3
        System.out.println(5 % 2);  //1

        //
        System.out.println(1/2); // 0
        System.out.println(2.0/2);

        // 最小参与运算的类型应该为 int

        byte b1 = 10 ;
        byte b2 = 20;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);
    }
}
