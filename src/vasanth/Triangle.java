package vasanth;

public class Triangle {
    public static void main(String[] args) {

        int n=5;

        //outer loop to handle rows
        for (int i=0;i<=n;i++){

            //1st loop to handle spaces
            for (int j=n-1;j>1;j--){
                System.out.print(" ");
            }

            //2nd loop to print *
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
