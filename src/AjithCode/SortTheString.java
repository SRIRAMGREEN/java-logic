package AjithCode;

import java.util.ArrayList;
import java.util.List;

public class SortTheString {
    public static void main(String[] args) {

        String aa = "ma1cha ar3e h0i ho2w you4 ";
        String output1 = "hi macha how are you"; // expected output
        StringBuffer buffer = new StringBuffer();
        StringBuffer bufferOutput = new StringBuffer();
        List<String> stringList = new ArrayList<>();
        List<String> output = new ArrayList<>();
        for (int i = 0; i < aa.length(); i++) {
//            System.out.println(aa.charAt(i));
            if (aa.charAt(i) != ' ') {
                buffer.append(aa.charAt(i));
            } else {
                stringList.add(String.valueOf(buffer));
                System.out.println(buffer);
                buffer.setLength(0);
                System.out.println(buffer);
            }

        }
        if (!buffer.equals("")) {
            stringList.add(String.valueOf(buffer));
        }

        System.out.println(stringList);


        for (int i = 0; i < stringList.size(); i++) {


            for (int j = 0; j < stringList.size(); j++) {
                if (stringList.get(j).contains(String.valueOf(i))) {
                    System.out.println(stringList.get(j));
                    String value = stringList.get(j);
                    String ss = value.replace(String.valueOf(i), "");
                    bufferOutput.append(ss + " ");
                    break;
                }
            }

        }

        System.out.println(bufferOutput);
        String newValue = bufferOutput.toString();

        int last = newValue.length() - 1;
        int first = newValue.charAt(0);
        int lastValue = newValue.charAt(last);
        String newOut = newValue;

        if (lastValue == ' ') {
            newOut=newValue.replace(String.valueOf(lastValue),"");
            System.out.println(newOut);
        }
        if(newOut.equals(output1)){
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }
}
