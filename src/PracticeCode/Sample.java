package PracticeCode;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample {
    public static void main(String[] args) {

//        String lowercaseRegex = "[a-z]";
//
//
//        if(lowercaseRegex.matches("a")){
//            System.out.println("a");
//        }else {
//            System.out.println("It is not a ");
//        }

        Scanner insert = new Scanner(System.in);
        System.out.println("insert values:");

//        [()]||[{}]||[[]]
//        "\\(.*\\).*\\)"

//        boolean b=true;
        Pattern p = Pattern.compile("\\(\\)||\\{\\}||\\[\\]");
        Matcher m = p.matcher(insert.next());
        boolean b = m.matches();
        System.out.println(b);

    }
}
