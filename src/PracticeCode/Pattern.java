package PracticeCode;

public class Pattern {
    public static void main(String[] args) {

        int n=5;
//        int row=0;
//        int column=0;

        for (int row=0;row<=n;row++){
            for (int column=0;column<=row;column++){
                System.out.print("$");
            }
            System.out.println(" ");
        }

        for (int row=0;row<=n;row++){
            for (int column=0;column<=n;column++){
                System.out.print(" ");
            }
            System.out.println("*");
        }


//        for (int row=n;row>=0;row--){
//            for (int column=n;column>=n;column--){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
    }
}
