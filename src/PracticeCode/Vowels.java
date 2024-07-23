package PracticeCode;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        String word = "ArabicKadaloram";
        int count = 0;
        for(int i=0; i<word.length();i++){
            char ch = Character.toLowerCase(word.charAt(i));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count=count+1;
            }
        }
        System.out.println(count);

           }
}




//public class VowelChecker {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String input = scanner.nextLine();
//
//        int vowelCount = countVowels(input);
//
//        System.out.println("Number of vowels in the string: " + vowelCount);
//    }
//
//    public static int countVowels(String str) {
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char ch = Character.toLowerCase(str.charAt(i));
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                count++;
//            }
//        }
//        return count;
//    }
//}
