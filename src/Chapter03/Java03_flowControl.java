package Chapter03;

public class Java03_flowControl {

    public static void main(String[] args) {
        System.out.println("第一步");
        System.out.println("第二步");

        int i=40;

        switch (i) {
            case 10:
                System.out.println("分支10");
            case 20:
                System.out.println("分支20");
            case 30:
                System.out.println("分支30");
            default:
                System.out.println("默认分支");
        }

        System.out.println("最后分支");
        
    }
}
