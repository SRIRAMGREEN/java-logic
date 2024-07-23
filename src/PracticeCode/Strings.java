package PracticeCode;

public class Strings {
    public static void main(String[] args) {
        String str1="Abc";
        String str2="Abc";   // string values will be stored in String constant pool(scp)
        String str3 = new String("Abc");  // string values will be stored in heap memory.
        String str4 = new String("abc");

        System.out.println(str1==str2);  //true
        System.out.println(str1==str3);  //false
        System.out.println(str1.equals(str3));  //true
        System.out.println(str1.equals(str4));  //false
        System.out.println(str1.equalsIgnoreCase(str4)); //true
    }
}
