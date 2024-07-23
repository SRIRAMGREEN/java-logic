package vasanth;

public class FindCharacters {
    public static void main(String[] args) {

        String word = "Hi!Welcome@";
        String reframed ="";

        int count = 0;

        for (int i=0; i<word.length();i++){
            if(!Character.isDigit(word.charAt(i)) && !Character.isAlphabetic(word.charAt(i)) && !Character.isWhitespace(word.charAt(i))){
                count=count+1;
            }else{
                reframed=reframed+word.charAt(i);
            }

        }
        if(count==0){
            System.out.println("there are no special special characters");
        }else {
            System.out.println("there are special characters "+ count);
        }
        System.out.println("special characters removed: "+ reframed);
    }
}
