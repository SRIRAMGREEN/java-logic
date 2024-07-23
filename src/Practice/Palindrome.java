package Practice;

public class Palindrome {
    public static void main(String[] args) {
        //integer

        int a=459;
        int rev=0;
        int rem=0;
        int temp =a;

        while (a>0){
            rem=a%10;
            rev=(rev*10)+rem;
            a=a/10;
        }
        if (rev==temp){
            System.out.println("it is a palindrome");
        } else if (rev!=temp) {
            System.out.println("it is not a palindrome");
        }




        //String

        String word = "MADAM";
        StringBuffer buffer=new StringBuffer();
        String newWord = "";
        for (int i=word.length()-1;i>=0;i--){
            buffer.append(word.charAt(i));
            newWord=buffer.toString();
        }
        if (newWord.equalsIgnoreCase(word)){
            System.out.println("palindrome");
        } else if (!newWord.equalsIgnoreCase(word)) {
            System.out.println("not a palindrome");
        }

    }
}
