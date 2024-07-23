package AjithCode;

public class RecursionExample {
    public static void main(String[] args) {

        sayHi(5);
    }
    public static void sayHi(int n){  // included n as a base case to declare the limit of execution
//        System.out.println("HI");
//        sayHi();

        if (n==0){
            System.out.println("Done!!!");
        }else {
            System.out.println("Hi");
            n--;   // making decrement of n to satisfy the if condition else it will run infinite times
                    //and throw stackoverflow error
            sayHi(n);  // recursion- calling of the same method again
        }

    }
    //need a base case: when to stop
}
