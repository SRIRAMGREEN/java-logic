package PracticeCode;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a=200;
        int b=100;



        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);
    }
}
