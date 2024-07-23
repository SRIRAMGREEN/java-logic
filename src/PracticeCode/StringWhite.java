package PracticeCode;

public class StringWhite {
    public static void main(String[] args) {
        String word = "Arun mozhi";
        String sec = word.replaceAll("\\s", "");
        System.out.println(sec);
    }
}
