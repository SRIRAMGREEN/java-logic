package AjithCode;


import java.util.ArrayList;
import java.util.List;

public class Recursion {
    public static void main(String[] args) {

        int i = 10;

        int initialValue = 1;

        List<Integer> list = new ArrayList<>();

    var outputList=    printNumbers(i,initialValue,list);
        System.out.println(outputList);
        }

    static List printNumbers(int i, int intialValue ,List<Integer> list) {

        if (intialValue <= i) {
            list.add(intialValue);
           return printNumbers(i, intialValue + 1,list);
        }
        else {
           return list;
        }


    }

}
