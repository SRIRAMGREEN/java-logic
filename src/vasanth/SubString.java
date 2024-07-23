package vasanth;

public class SubString {
    public static void main(String[] args) {
        String word = "Welcome to wonderland";

        // find the string form index 3
        String firstword=word.substring(3);
        System.out.println(firstword);

        // find the substring with starting and ending index
        String secondword = word.substring(3,7);
        System.out.println(secondword);
    }
}
