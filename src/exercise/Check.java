package exercise;

public class Check {
    public static void main(String[] args) {
        String word = "He is my dad";

        String[] verb = word.split(" ");

        StringBuffer buffer = new StringBuffer();
        for (String va:verb){
            buffer.append(va);

            StringBuffer reverseWord = buffer.reverse();
            if(!reverseWord.toString().equals(va)){
                StringBuffer buffer1 = new StringBuffer();
                buffer1.append(va);
                System.out.println("after removing palindrome: "+buffer1);
            }
            buffer.setLength(0);
        }
    }
}
