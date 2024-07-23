package AjithCode;

public class Practice {
    //factorial

    public static void main(String[] args) {
        int n = 4;
        int f = 1;
      var output=  fact(n, f);

        System.out.println(output);

    }

//        int n = 4;
//        int f = 1;
//        for (int i = 1; i <= n; i++) {
//            f = f * i;
//        }
//        System.out.println(f);


    public static int fact(int n, int f) {


        if (n == 0) {
            return f;
        } else {
            f = f * n;
            return fact(n - 1, f);
        }

    }
}

