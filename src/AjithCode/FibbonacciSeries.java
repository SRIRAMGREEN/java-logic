package AjithCode;

public class FibbonacciSeries {
    public static void main(String[] args) {
        int n = 5;
        int a=0;
        int b=1;
        // find the fibbonacci series for the integer 5.

        for(int i=0;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
