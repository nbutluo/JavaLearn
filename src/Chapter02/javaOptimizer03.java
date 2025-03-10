package Chapter02;

public class javaOptimizer03 {

    public static void main(String[] args) {
//        int i=10;
//        int j=100;
//
//        boolean result = (i>10) && ( ++j > 30);
//
//        System.out.println(result);
//        System.out.println(j);



        int i=10;
        int j=30;

        boolean result =  (i==10) || (++j>30);

        System.out.println(result);
        System.out.println(j);
    }

}
