package exercise;

public class FibonacciSeries {
    public static void main(String[] args) {

        int a=5;
        int n=0;

        for(int i=0;i<=a;i++){
            int b=n+i;
            n=b;
            System.out.println(b);
        }
    }
}
