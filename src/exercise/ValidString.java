package exercise;

import java.rmi.ServerException;

public class ValidString {
    public static void main(String[] args) throws Exception {

        String v1 = "((1*2)+2(2)";
        String v2 ="((1+2)+2(2))";



//            evaluateExpression(v1);

        int b = Integer.parseInt(v2);
        System.out.println(b);



    }

//    private static void evaluateExpression(String v1) throws Exception {
//        try {
//            int a = Integer.parseInt(v1);
//            System.out.println(a);
//        }catch (Exception e ){
//            throw new ServerException("expression is invalid");
//        }
//
//    }
}
