package PracticeCode;

public class MiddleString {
    public static void main(String[] args) {

        String word = "ajith";
        StringBuffer buffer=new StringBuffer();
        String subWord = "";
        int wordLength = word.length();
        if (wordLength%2!=0){
            int div = wordLength/2;
            System.out.println("----"+div);
            int re = div-1;
//            int last = re+2;
            for (int i=re;i<=wordLength;i++){

                if(subWord.length()<3) {
                    buffer.append(word.charAt(i));
                    subWord = String.valueOf(buffer);
                }else {
                    break;
                }
            }
            System.out.println("================"+subWord);
        }
    }
}
