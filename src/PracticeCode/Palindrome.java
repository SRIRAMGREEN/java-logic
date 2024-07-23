package PracticeCode;

public class Palindrome {
    public static void main(String[] args) {
        int num =485;
        int temp=num;
        int rem=0;

        int rev=0;


        while(num>0){
            rem=num%10;
            rev = (rev*10)+rem;
            num = num/10;
        }
        if(rev==temp){
            System.out.println(temp+" is a palindrome");
        } else if (rev!=temp) {
            System.out.println( temp+" is not a palindrome");
        }



        String word  = "MaDaM";
        StringBuffer buffer = new StringBuffer();
        String newWord ="";


        for (int i=word.length()-1;i>=0;i--){
            word.charAt(i);
            buffer.append(word.charAt(i));
            newWord= buffer.toString();
                  }
        System.out.println("reversed string: "+ newWord);

        if (newWord.equalsIgnoreCase(word)){
            System.out.println(word+" is a palindrome.");
        } else if (!newWord.equalsIgnoreCase(word)) {
            System.out.println(word+" is not a palindrome.");
        }

    }
}
