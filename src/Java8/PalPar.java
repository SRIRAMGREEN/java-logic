package Java8;

public class PalPar {
    public static void main(String[] args) {
        int a= 459;
        int rev=0;
        int rem = 0;
        int temp = a;

        while(a>0){
            rem=a%10;
            rev = (rev*10)+rem;
            a=a/10;
        }
        if (rev == temp) {
            System.out.println("palindrome");
        } else if (rev!=temp) {
            System.out.println("not a palindrome");
        }

        //string palindrome

        String word = "MADAMe";
        String revWord = "";
        StringBuffer buffer = new StringBuffer();

        for (int i=word.length()-1;i>=0;i--){
            buffer.append(word.charAt(i));
            revWord=buffer.toString();
        }
        System.out.println(revWord);
        if(revWord.equalsIgnoreCase(word)){
            System.out.println("is a palindrome");
        } else if (!revWord.equalsIgnoreCase(word)) {
            System.out.println("is not a palindrome");
        }
    }
}
